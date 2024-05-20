/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rol.personajes;

import com.rol.personajes.exceptions.*;

/**
 *
 * @author dev
 */
public class Mago extends Personaje {

    private String colorToga;
    private double largoVarita;

    public Mago(String colorToga, double largoVarita, String codigo, String nombre, int puntosVida, int puntosExp) throws TooLowNumber, IncorrectColor {
        super(codigo, nombre, puntosVida, puntosExp);
        this.setColorToga(colorToga);
        this.setLargoVarita(largoVarita);
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" + "colorToga=" + colorToga + ", largoVarita=" + largoVarita + '}';
    }

    @Override
    public void pocimaSanadora() {
        super.setPuntosVida(super.getPuntosVida() * 4);
        if (super.getPuntosVida() > 150) {
            super.setPuntosVida(150);
        }
    }

    public String getColorToga() {
        return colorToga;
    }

    public void setColorToga(String colorToga) throws IncorrectColor {
        if (!(colorToga.equalsIgnoreCase("Verde") 
                || colorToga.equalsIgnoreCase("Gris") 
                    || colorToga.equalsIgnoreCase("Blanca"))) {
            throw new IncorrectColor("No puede ser ni verde, ni blanca y tampoco gris.");
        } else {
            this.colorToga = colorToga;
        }
    }

    public double getLargoVarita() {
        return largoVarita;
    }

    public void setLargoVarita(double largoVarita) throws TooLowNumber {
        if (largoVarita < 0) {
            throw new TooLowNumber("Número muy bajo");
        } else {
            this.largoVarita = largoVarita;
        }
    }

}
