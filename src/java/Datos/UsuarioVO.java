/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Usuario;

/**
 *
 * @author DerKow
 */
public class UsuarioVO {
    private String rut;
    private int cargo;
    private int sector;
    private String nombre;
    private String fono;
    
    public UsuarioVO(){
        
    }
    
    public UsuarioVO(Usuario usuario) {
        this.rut = usuario.getRut();
        this.cargo = usuario.getCargo();
        this.sector = usuario.getSector();
        this.nombre = usuario.getNombre();
        this.fono = usuario.getFono();
    }

    public UsuarioVO(String rut, int cargo, int sector, String nombre, String fono) {
        this.rut = rut;
        this.cargo = cargo;
        this.sector = sector;
        this.nombre = nombre;
        this.fono = fono;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
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
    
}
