/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioB;

/**
 *
 * @author dev
 */
public class Moto extends Vehiculo{
    
    private int cantidadRuedas;

    public Moto(int cantidadRuedas, String marca, String modelo, String anyoFab, int kmAutomiaRestantes) {
        super(marca, modelo, anyoFab, kmAutomiaRestantes);
        this.cantidadRuedas = cantidadRuedas;
    }
    
    @Override
    public void repostar() {
        super.setKmAutomiaRestantes(300);
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    @Override
    public String toString() {
        return super.toString() +  " Moto{" + "cantidadRuedas=" + cantidadRuedas + '}';
    }
    
}
