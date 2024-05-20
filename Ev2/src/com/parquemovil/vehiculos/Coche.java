/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parquemovil.vehiculos;

import com.parquemovil.excepciones.InvalidColorException;

/**
 *
 * @author dev
 */
public class Coche extends Vehiculo {

    private String color;

    public Coche(String color, String codigo, String marca, String modelo, double kmAutonomia) throws InvalidColorException {
        super(codigo, marca, modelo, kmAutonomia);
        if (color.equals("Blanco") || color.equals("Negro")) {
            this.color = color;
        } else {
            throw new InvalidColorException("Color invalido");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Coche{" + "color=" + color + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws InvalidColorException {
        if (color.equals("Blanco") || color.equals("Negro")) {
            this.color = color;
        } else {
            throw new InvalidColorException("Color invalido");

        }
    }

    @Override
    public void repostar() {
        super.setKmAutonomia(super.getKmAutonomia() * 1.30);
    }

}
