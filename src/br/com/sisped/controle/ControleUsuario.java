/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisped.controle;

import br.com.sisped.modelo.ModeloUsuario;
import br.com.sisped.visao.TelaCadastroUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JVM
 */
public class ControleUsuario  {
    
 ModeloUsuario objModeloUsuario = new ModeloUsuario() ;
 TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario ();
 public static  ArrayList<String> registroAuxiliar = new ArrayList<String>();
    
    public void getDadosTela (ArrayList<String> Lista) throws SQLException{
    
         this.objModeloUsuario.setMatricula((Lista.get(0)));
         this.objModeloUsuario.enviarCamadaDaoConsultar();
    }

   public void getDadosDao(ArrayList<String> Lista) throws SQLException {
       
              
              Lista.get(0);   
              
    }
    
    public void getDadosTelaCadastar (ArrayList<String> Lista) throws SQLException {
     
      this.objModeloUsuario.setMatricula(Lista.get(0));
      this.objModeloUsuario.setNome(Lista.get(1));
      this.objModeloUsuario.setSenha(Lista.get(2)); 
      this.objModeloUsuario.setEmail(Lista.get(3));
      this.objModeloUsuario.setDepartamento(Lista.get(4));
      this.objModeloUsuario.enviarCamadaDaoCadastrar();
      
    }  
    
    public void setDadosTelaConsultar(ArrayList<String> Lista){
        
    registroAuxiliar.add(Lista.get(0));
     
     
     
   //  telaCadastroUsuario.txtNomeUsuario.setText(Lista.get(0));
   
    
    }
    
    public ArrayList setDadosTelaConsultar2(){
    ArrayList<String> registro = new ArrayList<String>();
       
         registro.add(0, registroAuxiliar.get(0))    ;
        
   //     JOptionPane.showMessageDialog(null,registroAuxiliar.get(0) );
    
   // this.telaCadastroUsuario.txtNomeUsuario.setText(registroAuxiliar.get(0));
   
   return registro ;
    }
    
}
