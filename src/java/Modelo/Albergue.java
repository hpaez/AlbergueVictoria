/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DerKow
 */
public class Albergue {

    private int id;
    private int sector;
    private String rut;
    private String nombre;
    private int estado;
    private String direccion;
    private int capacidad;
    private String fono;

    public Albergue() {

    }

    public Albergue(int id, int sector, String rut, String nombre, int estado, String direccion, int capacidad, String fono) {
        this.id = id;
        this.sector = sector;
        this.rut = rut;
        this.nombre = nombre;
        this.estado = estado;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.fono = fono;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
