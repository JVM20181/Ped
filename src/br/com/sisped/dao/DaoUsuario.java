/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisped.dao;

import br.com.sisped.controle.ControleLogin;
import br.com.sisped.controle.ControleUsuario;
import br.com.sisped.modelo.ModeloUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoUsuario {

    Connection cx;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar(ModeloUsuario modeloUsuario) throws SQLException {

        String sql = "select * from usuario where  matricula =? and senha =?";
        try {

            cx = ModuloConexao.conector();
            pst = cx.prepareStatement(sql);
            pst.setString(1, modeloUsuario.getMatricula());
            pst.setString(2, modeloUsuario.getSenha());
            rs = pst.executeQuery();

            if (rs.next()) {
                //  JOptionPane.showMessageDialog(null, "Logado");   
                String departamento = rs.getString(5);
                ControleLogin controleLogin = new ControleLogin();
                Integer logado = 1;
                controleLogin.validaTelaPrincipal(logado, departamento);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e Senha não encontrado");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                pst.close();
                cx.close();
                //  JOptionPane.showMessageDialog(null, "Conexão  encerrada");
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(null, "Conexão já encerrada");
            }
        }
    }

    public void consultar(ModeloUsuario modeloUsuario) {

        String sql = "select * from usuario where matricula = ?";

        try {

            cx = ModuloConexao.conector();
            pst = cx.prepareStatement(sql);
            pst.setString(1, modeloUsuario.getMatricula());
            rs = pst.executeQuery();

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Deu certo");
                modeloUsuario.setNome(rs.getString(2));
                //    modeloUsuario.setSenha(rs.getString(3));
                //     modeloUsuario.setEmail(rs.getString(4));
                //modeloUsuario.setDepartamento(rs.getString(5));
                //   modeloUsuario.buscarCamadaDaoConsultar();
                //  System.out.println(modeloUsuario.getNome()); 

                ArrayList<String> Registro = new ArrayList<String>();
                Registro.add(0, modeloUsuario.getNome());

                ControleUsuario controleUsuario = new ControleUsuario();
                controleUsuario.setDadosTelaConsultar(Registro);
              //  controleUsuario.getDadosDao(Registro);

                //   
                //  
            } else {

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void adicionar(ModeloUsuario modeloUsuario) throws SQLException {
        String sql = "insert into usuario(matricula,nome,senha,email,departamento) values(?,?,?,?,?)";
        try {
            cx = ModuloConexao.conector();
            pst = cx.prepareStatement(sql);
            pst.setString(1, modeloUsuario.getMatricula());
            pst.setString(2, modeloUsuario.getNome());
            pst.setString(3, modeloUsuario.getSenha());
            pst.setString(4, modeloUsuario.getEmail());
            pst.setString(5, modeloUsuario.getDepartamento());
            //Validação de campos obrigatorios
            if ((modeloUsuario.getMatricula().isEmpty()) || modeloUsuario.getNome().isEmpty()
                    || modeloUsuario.getSenha().isEmpty() || modeloUsuario.getEmail().isEmpty()
                    || modeloUsuario.getDepartamento().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                // e aestrutura abaixo é usada para confrmar a inserção de dados na tablela;
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado");
                    /* modeloUsuario.getMatricula());
                             modeloUsuario.getNome());
                             modeloUsuario.getSenha());
                             modeloUsuario.getEmail());
                             modeloUsuario.getDepartamento()*/
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}