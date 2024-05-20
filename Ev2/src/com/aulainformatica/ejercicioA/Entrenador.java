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
public class Entrenador extends Persona {

    LocalDate anyoComienzoActividad;

    public Entrenador(LocalDate anyoComienzoActividad, int id, String nombre, String apellidos, LocalDate fNac, int energia) {
        super(id, nombre, apellidos, fNac, energia);
        this.anyoComienzoActividad = anyoComienzoActividad;
    }

    @Override
    public void doping() {
        super.energia = energia;
    }

    @Override
    public String toString() {
        return super.toString() + "Entrenador, " +  anyoComienzoActividad + " comienzo de actividad";
    }

    
}
