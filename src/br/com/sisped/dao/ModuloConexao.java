/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisped.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ModuloConexao {
   
   /* public Connection conexao = null;
    public String url = "jdbc:mysql://localhost:3306/sisp&d";
    public String user = "root";
    public String password = "";
   /private static ModuloConexao instancy = null;*/
   

    public static Connection conector() {
       
        java.sql.Connection conexao = null;
        //A linha abaixo "chama" o driver 
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/sisp&d";
        String user = "root";
        String password = "";
        //estabelecendo a conexão com o banco
            try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //A linha abaixo serve de apoio para esclarecer o erro
            System.out.println(e);
            return null;
        }
    }
    }


/*    private ModuloConexao() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            JOptionPane.showMessageDialog(null, "Driver OK");
            conexao = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Driver Não OK");
        }

        try {
            this.conexao = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexão OK");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexão Não OK");
        }
        
       // instancy = null;
    }

    public static ModuloConexao getInstancy() {

        if (instancy == null) {
            
            instancy = new ModuloConexao();
        }
        return instancy;
    }
    
    public Connection getConexao ()   {
     return this.conexao ;
    }*/


    
    
    

