/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

import java.time.*;

/**
 *
 * @author dev
 */
public class Técnico extends Empleado {
    
    private String especialidad;

    public Técnico(String especialidad, int codigo, String nombre, String apellidos, LocalDate fechaNac) {
        super(codigo, nombre, apellidos, fechaNac);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Técnico{" + "especialidad=" + especialidad + '}';
    }

    
    
   
    
}
