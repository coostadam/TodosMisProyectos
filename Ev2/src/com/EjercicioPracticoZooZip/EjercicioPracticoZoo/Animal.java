/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoZoo;

/**
 *
 * @author dariu
 */
public abstract class Animal {

    private String codigo;
    private String nombre;
    private double peso;
    private int hambre;

    public Animal(String codigo, String nombre, double peso, int hambre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.hambre = hambre;
    }

    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + ", peso=" + peso + ", hambre=" + hambre + '}';
    }

    public abstract void darDeComer();

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        if (hambre > 100) {
        this.setHambre(100);
        } else if (hambre < 0) {
     this.setHambre(0);
        } else {
            this.hambre = hambre;

        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
