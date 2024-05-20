/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rol.personajes;

import com.rol.personajes.exceptions.TooLowNumber;

/**
 *
 * @author dev
 */
public class Elfo extends Personaje {

    private double longitudDeOrejas;
    private int flechasPorSegundo;

    public Elfo(double longitudDeOrejas, int flechasPorSegundo, String codigo, String nombre, int puntosVida, int puntosExp) throws TooLowNumber {
        super(codigo, nombre, puntosVida, puntosExp);
       this.setLongitudDeOrejas(longitudDeOrejas);
       this.setFlechasPorSegundo(flechasPorSegundo);
    }

    @Override
    public String toString() {
        return super.toString() + "Elfo{" + "longitudDeOrejas=" + longitudDeOrejas + ", flechasPorSegundo=" + flechasPorSegundo + '}';
    }

    public double getLongitudDeOrejas() {
        return longitudDeOrejas;
    }

    public void setLongitudDeOrejas(double longitudDeOrejas) throws TooLowNumber {
        if (longitudDeOrejas < 0) {
            throw new TooLowNumber("Número bajo cero");
        } else {
            this.longitudDeOrejas = longitudDeOrejas;
        }
    }

    public int getFlechasPorSegundo() {
        return flechasPorSegundo;
    }

    public void setFlechasPorSegundo(int flechasPorSegundo) throws TooLowNumber {
        if (flechasPorSegundo < 0) {
            throw new TooLowNumber("Número bajo cero");
        } else {
            this.flechasPorSegundo = flechasPorSegundo;
        }
    }

    @Override
    public void pocimaSanadora() {
        super.setPuntosVida(super.getPuntosVida() + 20);
        if (super.getPuntosVida() < 100) {
            super.setPuntosVida(100);
        }
    }
}
