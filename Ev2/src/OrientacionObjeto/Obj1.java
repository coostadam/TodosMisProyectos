/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class Obj1 {
    String piloto;
    String coche;
    String escuderia;
    int velocidad;
    double tiempo;
    double gasolina;

    public Obj1(String piloto) {
        this.piloto = piloto;
        if (this.piloto.equalsIgnoreCase("Alonso")) {
            this.coche = "AMR23";
            this.escuderia = "Aston Martin";
        }else if (this.piloto.equalsIgnoreCase("Sainz")){
            this.coche = "SF23";
            this.escuderia = "Ferrari";
        }else if (this.piloto.equalsIgnoreCase("Verstappen")){
            this.coche = "RB23";
            this.escuderia = "Red Bull";
        }
    }
    
    public Obj1(int velocidad){
        this.velocidad = velocidad;
    }
    
    public Obj1(double gasolina){
        this.gasolina = gasolina;
    }
    
    public void tiempo(int distancia){
        this.tiempo = distancia / this.velocidad;
    }
    
    public void repostaje(int litros){
        this.gasolina = litros + this.gasolina;
    }
    
}
