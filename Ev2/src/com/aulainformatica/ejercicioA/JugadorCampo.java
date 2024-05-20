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
public class JugadorCampo extends Persona implements Comparable {

    private int golesMarcados;

    public JugadorCampo(int golesMarcados, int id, String nombre, String apellidos, LocalDate fNac, int energia)  throws TooManyGoalsException {

        super(id, nombre, apellidos, fNac, energia);
        if (golesMarcados > 1000) {
            throw new TooManyGoalsException("Demasiados goles.");
        } else {
            this.golesMarcados = golesMarcados;
        }

    }

    @Override
    public void doping() {
        super.energia = (int) (super.energia * 1.20);
    }

    @Override
    public String toString() {
        return super.toString() + "Jugador de Campo " + "con " + golesMarcados + " goles marcados";
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) throws TooManyGoalsException {
        if (golesMarcados > 1000) {
            throw new TooManyGoalsException("Demasiados goles.");
        } else {
            this.golesMarcados = golesMarcados;
        }
    }

    @Override
    public int compareTo(Object o) {
        JugadorCampo otro = (JugadorCampo) o;
        return Double.compare(otro.golesMarcados, this.golesMarcados);
    }

}
