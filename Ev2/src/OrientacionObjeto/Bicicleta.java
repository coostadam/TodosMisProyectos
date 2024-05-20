/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class Bicicleta {
    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private String nSerie;
    private Componente[] cArray;

    public Bicicleta(String marca, String modelo, String color, String tipo, String nSerie, Componente[] cArray) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.nSerie = nSerie;
        this.cArray = cArray;
    }
   
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getnSerie() {
        return nSerie;
    }

   

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }
    
    
    
    public double getSumaPesoComponentes(){
        double suma = 0;
        for (Componente componente : this.cArray) {
            suma += componente.getPeso();
        }
        return suma;
    }
    
}
