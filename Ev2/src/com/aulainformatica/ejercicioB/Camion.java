/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioB;

/**
 *
 * @author dev
 */
public class Camion extends Vehiculo {

    private int nEjes;
    private int pesoMaxAutorizado;

    public Camion(int nEjes, int pesoMaxAutorizado, String marca, String modelo, String anyoFab, int kmAutomiaRestantes) throws TooLowAxlesException, TooHighAxlesException {
        super(marca, modelo, anyoFab, kmAutomiaRestantes);
        if (nEjes < 2) {
            throw new TooLowAxlesException("Has introducido muy pocos ejes");
        } else if (nEjes > 12) {
            throw new TooHighAxlesException("Has introducido demasiados ejes");
        } else {
            this.nEjes = nEjes;
        }
        this.pesoMaxAutorizado = pesoMaxAutorizado;
    }

    @Override
    public void repostar() {
        super.setKmAutomiaRestantes(800);
    }

    public int getnEjes() {
        return nEjes;
    }

    public void setnEjes(int nEjes) throws TooLowAxlesException, TooHighAxlesException {
        if (nEjes < 2) {
            throw new TooLowAxlesException("Has introducido muy pocos ejes");
        } else if (nEjes > 12) {
            throw new TooHighAxlesException("Has introducido demasiados ejes");
        } else {
            this.nEjes = nEjes;
        }
    }

    public int getPesoMaxAutorizado() {
        return pesoMaxAutorizado;
    }

    public void setPesoMaxAutorizado(int pesoMaxAutorizado) {
        this.pesoMaxAutorizado = pesoMaxAutorizado;
    }

    @Override
    public String toString() {
        return super.toString() + " Camion{" + "nEjes=" + nEjes + ", pesoMaxAutorizado=" + pesoMaxAutorizado + '}';
    }

}
