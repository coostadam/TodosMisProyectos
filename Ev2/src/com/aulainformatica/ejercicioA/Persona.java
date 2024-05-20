/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioA;

import java.time.LocalDate;

/**
 *
 * @author dev
 */
public abstract class Persona {

    private int id;
    private String nombre;
    private String apellidos;
    private LocalDate fNac;
    int energia;

    public Persona(int id, String nombre, String apellidos, LocalDate fNac, int energia) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNac = fNac;
        this.energia = energia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void doping();

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fNac=" + fNac + ", energia=" + energia + '}';
    }
    
    
}
