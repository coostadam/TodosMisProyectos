/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;


/**
 *
 * @author dev
 */
public class JugadorBaloncesto implements Comparable {
    private String nombre;
    private int edad; 
    private String nombreEquipo;
    private int numCanastasIntroducidas;
    private String provincia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getNumCanastasIntroducidas() {
        return numCanastasIntroducidas;
    }

    public void setNumCanastasIntroducidas(int numCanastasIntroducidas) {
        this.numCanastasIntroducidas = numCanastasIntroducidas;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "JugadorBaloncesto{" + "nombre=" + nombre + ", edad=" + edad + ", nombreEquipo=" + nombreEquipo + ", numCanastasIntroducidas=" + numCanastasIntroducidas + ", provincia=" + provincia + '}';
    }

    public JugadorBaloncesto(String nombre, int edad, String nombreEquipo, int numCanastasIntroducidas, String provincia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreEquipo = nombreEquipo;
        this.numCanastasIntroducidas = numCanastasIntroducidas;
        this.provincia = provincia;
    }

    @Override
    public int compareTo(Object o) {
        JugadorBaloncesto jugador = (JugadorBaloncesto) o;
        return this.provincia.compareTo(jugador.provincia);
    }
    
    
    
}
