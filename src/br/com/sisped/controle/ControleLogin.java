/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisped.controle;

//tESTE

import br.com.sisped.modelo.ModeloUsuario;
import br.com.sisped.visao.TelaLogin;
import br.com.sisped.visao.TelaPrincipal;
import java.sql.SQLException;
import java.util.ArrayList;


public class ControleLogin implements ControleMetodos {
    
   // Cria um objeto do tipo TelaLogin
    TelaLogin telaLogin = new TelaLogin();
  // Cria um objeto do tipo TelaPrincipal
    TelaPrincipal telaPrincipal = new TelaPrincipal();
  // Cria um objeto do tipo  ModeloUsuario()
    public  ModeloUsuario objModeloUsuario = new ModeloUsuario() ;
  
 // cria um metodo que será utilizado na classe TelaLogin, a partir de seu objeto, para pegar dados de login;
    @Override
    public void getDadosTela (ArrayList<String> Lista) throws SQLException {
      
 //  Insere no objeto objModeloUsuario Matricula (sets e gets)
      this.objModeloUsuario.setMatricula((Lista.get(0)));
 //  Insere no objeto objModeloUsuario senha (sets e gets)
      this.objModeloUsuario.setSenha(Lista.get(1));
 // Cama o metodo Salvar implemetado na classe ModeloUsuario
      this.objModeloUsuario.enviarCamadaDaoLogin();
  
    
}
   
    public void validaTelaPrincipal(Integer valor, String departamento ){
     
        if (valor != null && departamento.equals("Suporte")){

        telaPrincipal.setVisible(true);
        telaPrincipal.jMenuCadUsuTelaPrincipal.setEnabled(true);
        
        
        }
        if (valor != null && departamento.equals("Recusos Humanos")){

        telaPrincipal.setVisible(true);
        telaPrincipal.jMenuCadRHTelaPrincipal.setEnabled(true);
            
        
        }
         
        if (valor != null && departamento.equals("Contabilidade")){

        telaPrincipal.setVisible(true);
        telaPrincipal.jMenuCadContTelaPrincipal.setVisible(true);
            
        }

}

    public static String dd(String departamento) {
        return departamento;
    }

    @Override
    public void setDadosTela(ArrayList<String> Lista) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
