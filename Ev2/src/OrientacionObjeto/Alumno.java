/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

import java.time.LocalDate;

/**
 *
 * @author dev
 */
public class Alumno {
    private String nombre;
    private LocalDate fNac;
    private double nota;

    public Alumno(String nombre, LocalDate fNac, double nota) {
        this.nombre = nombre;
        this.fNac = fNac;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }
    
}
