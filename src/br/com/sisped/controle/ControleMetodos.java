/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisped.controle;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JVM
 */
public interface ControleMetodos {
    
      public void getDadosTela (ArrayList<String> Lista)throws SQLException;
      
      public void setDadosTela (ArrayList<String> Lista)throws SQLException;
}
