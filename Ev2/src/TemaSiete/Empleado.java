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
public class Empleado {

    private int codigo;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;

    public Empleado(int codigo, String nombre, String apellidos, LocalDate fechaNac) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    @Override
    public int hashCode() {
        return this.codigo;
    }

    @Override
    public boolean equals(Object obj) {
        Empleado other = (Empleado) obj;
        return other.codigo == this.codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + '}';
    }

}
