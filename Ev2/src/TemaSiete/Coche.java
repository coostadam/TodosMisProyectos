/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

import java.time.*;
import java.util.Objects;

/**
 *
 * @author dev
 */
public class Coche implements Comparable{
    private String marca;
    private String modelo;
    private LocalDate fechaFab;
    private double litrosGaso;
    private double kmRecorridos;

    public Coche(String marca, String modelo, LocalDate fechaFab, double litrosGaso, double kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFab = fechaFab;
        this.litrosGaso = litrosGaso;
        this.kmRecorridos = kmRecorridos;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
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

    public LocalDate getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(LocalDate fechaFab) {
        this.fechaFab = fechaFab;
    }

    public double getLitrosGaso() {
        return litrosGaso;
    }

    public void setLitrosGaso(double litrosGaso) {
        this.litrosGaso = litrosGaso;
    }

    @Override
    public String toString() {
        return "Coche{" + "Marca=" + marca + ", Modelo=" + modelo + ", Fecha fabricación=" + fechaFab + ", Litros Gasolina=" + litrosGaso + ", Kilometros Recorridos=" + kmRecorridos + '}';
    }
    
    public Double kmA100(){
        return this.litrosGaso * 100 / this.kmRecorridos;
    }

    @Override
    public int compareTo(Object o) {
        Coche cocheOtro = (Coche)o;
        
        if (!Objects.equals(this.kmA100(), cocheOtro.kmA100())) {
            return this.kmA100().compareTo(cocheOtro.kmA100());
        }else if(this.fechaFab != cocheOtro.getFechaFab()){
            return cocheOtro.fechaFab.compareTo(this.fechaFab);
        }else if (this.marca.equalsIgnoreCase(cocheOtro.marca)){
            return this.marca.compareTo(cocheOtro.marca);
        }
        return this.modelo.compareTo(cocheOtro.modelo);
        
    }
    
    
}
