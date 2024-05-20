/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoZoo;

/**
 *
 * @author dariu
 */
public class Tiburon extends Animal {
    private double largoAleta;

    @Override
    public String toString() {
        return super.toString() +  "  --> Tiburon{" + "largoAleta=" + largoAleta + '}';
    }

    public Tiburon(double largoAleta, String codigo, String nombre, double peso, int hambre) {
        super(codigo, nombre, peso, hambre);
        this.largoAleta = largoAleta;
    }

    @Override
    public void darDeComer() {
        super.setHambre(super.getHambre() + 30);
    }
    

    public double getLargoAleta() {
        return largoAleta;
    }

    public void setLargoAleta(double largoAleta) {
        this.largoAleta = largoAleta;
    }
    
}
