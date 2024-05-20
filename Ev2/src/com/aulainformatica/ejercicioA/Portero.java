/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioA;

import java.time.LocalDate;

/**
 *
 * @author dev
 */
public class Portero extends Persona {

    private int porcentajeParadas;

    public Portero(int porcentajeParadas, int id, String nombre, String apellidos, LocalDate fNac, int energia) throws TooLowPorcentageSavesException, TooHighPorcentageSavesException {
        super(id, nombre, apellidos, fNac, energia);
        if (porcentajeParadas < 0) {
            throw new TooLowPorcentageSavesException("Porcentaje muy bajo de paradas.");
        } else if (porcentajeParadas > 100) {
            throw new TooHighPorcentageSavesException("Porcentaje muy alto de paradas.");
        } else {
            this.porcentajeParadas = porcentajeParadas;
        }
    }

    @Override
    public void doping() {
        super.energia = (int) (super.energia * 1.10);
        this.porcentajeParadas = this.porcentajeParadas + 5;
        if (this.porcentajeParadas > 100) {
            this.porcentajeParadas = 100;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Portero, " + "Porcentaje de paradas=" + porcentajeParadas + "%";
    }

    public double getPorcentajeParadas() {
        return porcentajeParadas;
    }

    public void setPorcentajeParadas(int porcentajeParadas) throws TooLowPorcentageSavesException, TooHighPorcentageSavesException  {
        if (porcentajeParadas < 0) {
            throw new TooLowPorcentageSavesException("Porcentaje muy bajo de paradas.");
        } else if (porcentajeParadas > 100) {
            throw new TooHighPorcentageSavesException("Porcentaje muy alto de paradas.");
        } else {
            this.porcentajeParadas = porcentajeParadas;
        }
    }

}
