/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisped.modelo;

import br.com.sisped.controle.ControleUsuario;
import br.com.sisped.dao.DaoUsuario;
import java.sql.SQLException;


public class ModeloUsuario implements ModeloMetodos   {
    
    private String matricula;
    private String nome;
    private String senha;
    private String email;
    private String departamento; 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public void enviarCamadaDaoLogin()throws SQLException{   
    DaoUsuario daoUsuario = new  DaoUsuario();
    daoUsuario.logar(this);
    }
  
    @Override
    public void enviarCamadaDaoConsultar()throws SQLException{   
    DaoUsuario daoUsuario = new  DaoUsuario();
    daoUsuario.consultar(this);
    }
    
    
    public void enviarCamadaDaoCadastrar()throws SQLException{   
    DaoUsuario daoUsuario = new  DaoUsuario();
    daoUsuario.adicionar(this);
    }

    @Override
    public void buscarCamadaDaoConsultar() throws SQLException {
        DaoUsuario daoUsuario = new DaoUsuario();
       
    }

    @Override
    public void enviarCamadaDaoEditar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
