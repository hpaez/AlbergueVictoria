/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Datos.AlbergueDAO;
import Datos.AlbergueVO;
import Datos.UsuarioVO;
import java.util.ArrayList;

/**
 *
 * @author DerKow
 */
public class Usuario {
    private String rut;
    private int cargo;
    private int sector;
    private String nombre;
    private String fono;
    Albergue albergue = new Albergue();
    
    public Usuario(){
        
    }

    public Usuario(String rut, int cargo, int sector, String nombre, String fono) {
        this.rut = rut;
        this.cargo = cargo;
        this.sector = sector;
        this.nombre = nombre;
        this.fono = fono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }
    
    public ArrayList<AlbergueVO> buscarAlbergue(UsuarioVO objUsuarioVO){
        return albergue.buscarAlbergue(objUsuarioVO);
    }
}
