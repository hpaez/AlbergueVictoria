/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author DerKow
 */
public class UsuarioDAO {
    private ConexionBD conexion;
    private static UsuarioDAO  instancia;
    
    public static UsuarioDAO getInstancia(){
        if (instancia == null) {
            instancia = new UsuarioDAO();
        }
        return instancia;
    }
    
    public UsuarioDAO(){
        this.conexion =  ConexionBD.getInstancia();
        this.conexion.conectar();
    }
}
