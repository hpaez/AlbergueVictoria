/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;

/**
 *
 * @author DerKow
 */
public class ConexionBD {
    
    private Connection conexion;
    private static ConexionBD  instancia;

    
    public static ConexionBD getInstancia(){
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }
    
    public ConexionBD(){
        
    }
    
    public void conectar(){
        System.out.println(prepararBD());
        System.out.println(habilitarBD());
    }
    
    private String prepararBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return "Operacion realizada y verificada correctamente";
        }
        catch(ClassNotFoundException e){
            return "Operacion no se completo correctamente";
        }
    }
    
    private String habilitarBD(){
        String namebd="Albergue";
        String username="root";
        String password="123456";
        String url="jdbc:mysql://localhost/"+namebd;
        
        // Establecer el canal de comunicación con la BD
        try {
            this.conexion = DriverManager.getConnection(url, username, password);
            return "Conexión exitosa";    
        }
        catch(Exception e){
            return "Conexion fracasada";
        }
    }
    
    public void descoenctarBD(){
        conexion = null;
    }
    
    private Statement crearSentencia(){
        try {
            return this.conexion.createStatement();
        }
        catch(SQLException e){
            return null; 
        }
    }
    
    public ResultSet ejecutarQuery(String query){
        try {
            Statement st = this.crearSentencia();
            return st.executeQuery(query);
        }
        catch(SQLException e){
            return null;
        }
    }    
    
    public int ejecutarUpdate(String query){
        try {
            Statement st = this.crearSentencia();
            return st.executeUpdate(query);
        }
        catch(SQLException e){
            return -1;
        }
    }
}
