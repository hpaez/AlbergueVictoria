/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Albergue;

/**
 *
 * @author DerKow
 */
public class AlbergueVO {

    private int idAlbergue;
    private int idSector;
    private String rutUsuario;
    private String nombre;
    private int estado;
    private String direccion;
    private int capacidad;
    private String fono;
    
    public AlbergueVO(){
        
    }

    public AlbergueVO(Albergue albergue) {
        this.idAlbergue = albergue.getId();
        this.idSector = albergue.getSector();
        this.rutUsuario = albergue.getRut();
        this.nombre = albergue.getNombre();
        this.estado = albergue.getEstado();
        this.direccion = albergue.getDireccion();
        this.capacidad = albergue.getCapacidad();
        this.fono = albergue.getFono();
    }

    public AlbergueVO(int idAlbergue, int idSector, String rutUsuario, String nombre, int estado, String direccion, int capacidad, String fono) {
        this.idAlbergue = idAlbergue;
        this.idSector = idSector;
        this.rutUsuario = rutUsuario;
        this.nombre = nombre;
        this.estado = estado;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.fono = fono;
    }

    public int getIdAlbergue() {
        return idAlbergue;
    }

    public void setIdAlbergue(int idAlbergue) {
        this.idAlbergue = idAlbergue;
    }

    public int getIdSector() {
        return idSector;
    }

    public void setIdSector(int idSector) {
        this.idSector = idSector;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

}
