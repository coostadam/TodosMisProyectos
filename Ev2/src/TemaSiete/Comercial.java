/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

import java.time.LocalDate;

/**
 *
 * @author dev
 */
public class Comercial extends Empleado {
    private String zona;

    public Comercial(String zona, int codigo, String nombre, String apellidos, LocalDate fechaNac) {
        super(codigo, nombre, apellidos, fechaNac);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "Comercial{" + "zona=" + zona + '}';
    }
     
}
