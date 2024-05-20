/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parquemovil.vehiculos;

import com.parquemovil.excepciones.InvalidKgCargaException;

/**
 *
 * @author dev
 */
public class Tractor extends Vehiculo {

    private double kgCargaMaxima;

    public Tractor(double kgCargaMaxima, String codigo, String marca, String modelo, double kmAutonomia) throws InvalidKgCargaException {
        super(codigo, marca, modelo, kmAutonomia);
         if (kgCargaMaxima < 100 || kgCargaMaxima > 5000) {
            throw new InvalidKgCargaException("La carga introducida es incorrecta");
        } else {
            this.kgCargaMaxima = kgCargaMaxima;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tractor{" + "kgCargaMaxima=" + kgCargaMaxima + '}';
    }

    public double getKgCargaMaxima() {
        return kgCargaMaxima;
    }

    public void setKgCargaMaxima(double kgCargaMaxima) throws InvalidKgCargaException {
        if (kgCargaMaxima < 100 || kgCargaMaxima > 5000) {
            throw new InvalidKgCargaException("La carga introducida es incorrecta");
        } else {
            this.kgCargaMaxima = kgCargaMaxima;
        }
    }

    @Override
    public void repostar() {
        super.setKmAutonomia(super.getKmAutonomia() * 1.20);
    }

}
