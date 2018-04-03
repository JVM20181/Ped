/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import br.com.sisped.controle.ControleUsuario;
import br.com.sisped.dao.DaoUsuario;
import br.com.sisped.modelo.ModeloUsuario;
import java.sql.SQLException;

/**
 *
 * @author JVM
 */
public class APP {
    
    public static void main(String[] args) throws SQLException {
        
        ModeloUsuario modeloUsuario = new  ModeloUsuario();
        ControleUsuario controleUsuario = new  ControleUsuario();
        
        DaoUsuario u = new DaoUsuario();
       // u.consultar(modeloUsuario);
     //   u.consultar(modeloUsuario);
      // u.consultar(modeloUsuario);
  
        
        
    }
    
}
