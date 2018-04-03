/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisped.modelo;

import java.sql.SQLException;

/**
 *
 * @author JVM
 */
public interface ModeloMetodos {
    
    public void enviarCamadaDaoLogin() throws SQLException;
    
    public void enviarCamadaDaoConsultar() throws SQLException;
    
    public void buscarCamadaDaoConsultar() throws SQLException;
    
    public void enviarCamadaDaoEditar() throws SQLException;
       
    
}
