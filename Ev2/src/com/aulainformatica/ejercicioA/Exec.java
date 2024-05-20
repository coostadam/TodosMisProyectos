/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioA;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) throws TooLowPorcentageSavesException, TooHighPorcentageSavesException, TooManyGoalsException {
        List<Persona> pers = new ArrayList<>();

        pers.add(new Entrenador(LocalDate.parse("2008-10-11"), 01, "Carlo", "Ancelotti", LocalDate.parse("1967-05-12"), 52));
        pers.add(new Entrenador(LocalDate.parse("2021-04-21"), 02, "Xabi", "Alonso", LocalDate.parse("1981-11-25"), 60));
        pers.add(new Entrenador(LocalDate.parse("1974-06-01"), 02, "Alex", "Ferguson", LocalDate.parse("1941-12-31"), 10));

        try {
            pers.add(new Portero(100, 21, "Alejandro", "Villegas Congui", LocalDate.parse("2006-03-26"), 8));
        } catch (TooLowPorcentageSavesException | TooHighPorcentageSavesException e) {
            System.out.println(e.getMessage() );
        } catch (Exception e) {
            System.out.println("Error no esperado.");
        }

        try {
            pers.add(new Portero(15, 22, "Adrián", "Moreno", LocalDate.parse("2005-02-13"), 78));
        } catch (TooLowPorcentageSavesException | TooHighPorcentageSavesException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error no esperado.");
        }

        try {
            pers.add(new JugadorCampo(561, 40, "Paco", "El Muga", LocalDate.parse("1998-07-10"), 61));
        } catch (TooManyGoalsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error no esperado.");
        }

        try {
            pers.add(new JugadorCampo(411, 41, "Daniel", "Mbappé", LocalDate.parse("2002-08-12"), 78));
        } catch (TooManyGoalsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error no esperado.");
        }

        try {
            pers.add(new JugadorCampo(1000, 52, "Cristiano", "Ronaldo", LocalDate.parse("1985-02-05"), 100));
        } catch (TooManyGoalsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error no esperado.");
        }

        listarCompleto(pers);
        doparPorteroMenos20Paradas(pers);
        mediaGoles(pers);
        entrenadorMasExp(pers);
        masGolesAMenos(pers);
        eliminarMejorPortero(pers);
    }

    public static void listarCompleto(List<Persona> pers) {
        System.out.println("--------Todas personas--------");
        for (Persona per : pers) {
            System.out.println(per);
        }
    }

    public static void doparPorteroMenos20Paradas(List<Persona> pers) {
        System.out.println("--------Dopando porteros con menos de 20% de paradas--------");
        for (Persona per : pers) {
            if (per instanceof Portero portero) {
                if (portero.getPorcentajeParadas() < 20) {
                    portero.doping();
                    System.out.println(per);
                }
            }
        }
    }

    public static void mediaGoles(List<Persona> pers) {
        System.out.println("--------Media de goles--------");
        int contGoles = 0, cont = 0;
        for (Persona per : pers) {
            if (per instanceof JugadorCampo jugadorCampo) {
                contGoles += jugadorCampo.getGolesMarcados();
                cont++;
            }
        }
        System.out.println("La media de goles es de: " + (contGoles / cont));
    }

    public static void entrenadorMasExp(List<Persona> pers) {
        System.out.println("--------Entrenador con más experiencia--------");
        LocalDate maxExp = LocalDate.MAX;
        String entMaxExp = "";
        for (Persona per : pers) {
            if (per instanceof Entrenador entrenador) {
                if (entrenador.anyoComienzoActividad.isBefore(maxExp)) {
                    maxExp = entrenador.anyoComienzoActividad;
                    entMaxExp = per.getNombre() + " " + per.getApellidos();
                }
            }
        }
        System.out.println("El entrenador con más experiencia es " + entMaxExp + ".");
    }

    public static void masGolesAMenos(List<Persona> pers) {
        System.out.println("--------Más goles a menos--------");
        List<JugadorCampo> jugGoles = new ArrayList<>();
        for (Persona per : pers) {
            if (per instanceof JugadorCampo jugadorCampo) {
                jugGoles.add(jugadorCampo);
            }
        }
        Collections.sort(jugGoles);
        for (JugadorCampo jugGole : jugGoles) {
            System.out.println(jugGole);
        }
    }

    public static void eliminarMejorPortero(List<Persona> pers) {
        System.out.println("--------Eliminar mejor portero--------");
        double mejorPorcentaje = Integer.MIN_VALUE;
        int pos = 0;
        for (Persona per : pers) {
            if (per instanceof Portero portero) {
                if (portero.getPorcentajeParadas() > mejorPorcentaje) {
                    mejorPorcentaje = portero.getPorcentajeParadas();
                    pos = pers.indexOf(per);
                }
            }
        }
        pers.remove(pos);
        for (Persona per : pers) {
            System.out.println(per);
        }
    }
}
