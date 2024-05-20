/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioB;

/**
 *
 * @author dev
 */
public class Coche extends Vehiculo {

    private int numPasajeros;

    public Coche(int numPasajeros, String marca, String modelo, String anyoFab, int kmAutomiaRestantes) throws TooLowPassengersException, TooHighPassengersException {
        super(marca, modelo, anyoFab, kmAutomiaRestantes);
        if (numPasajeros < 2) {
            throw new TooLowPassengersException("Has introducido muy pocos pasajeros");
        } else if (numPasajeros > 8) {
            throw new TooHighPassengersException("Has introducido demasiados pasajeros");
        } else {
            this.numPasajeros = numPasajeros;
        }
    }

    @Override
    public void repostar() {
        super.setKmAutomiaRestantes(550);
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) throws TooLowPassengersException, TooHighPassengersException {
        if (numPasajeros < 2) {
            throw new TooLowPassengersException("Has introducido muy pocos pasajeros");
        } else if (numPasajeros > 8) {
            throw new TooHighPassengersException("Has introducido demasiados pasajeros");
        } else {
            this.numPasajeros = numPasajeros;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Coche{" + "numPasajeros=" + numPasajeros + '}';
    }

}
