/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioB;

/**
 *
 * @author dev
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String anyoFab;
    private int kmAutomiaRestantes;

    public Vehiculo(String marca, String modelo, String anyoFab, int kmAutomiaRestantes) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFab = anyoFab;
        this.kmAutomiaRestantes = kmAutomiaRestantes;
    }

    public int getKmAutomiaRestantes() {
        return kmAutomiaRestantes;
    }

    public void setKmAutomiaRestantes(int kmAutomiaRestantes) {
        this.kmAutomiaRestantes = kmAutomiaRestantes;
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

    public String getAnyoFab() {
        return anyoFab;
    }

    public void setAnyoFab(String anyoFab) {
        this.anyoFab = anyoFab;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anyoFab=" + anyoFab + ", kmAutomiaRestantes=" + kmAutomiaRestantes ;
    }
    
    public abstract void repostar();
}
