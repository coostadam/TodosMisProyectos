/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) throws TooLowPassengersException, TooHighPassengersException, TooLowAxlesException, TooHighAxlesException {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> vehi = new ArrayList<>();

        try {
            vehi.add(new Coche(1, "Seat", "Ibiza", "2007", 187));
        } catch (TooLowPassengersException | TooHighPassengersException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehi.add(new Coche(11, "Ferrari", "LaFerrari", "2021", 231));
        } catch (TooLowPassengersException | TooHighPassengersException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehi.add(new Coche(2, "Lamborghini", "Veneno", "2023", 95));
        } catch (TooLowPassengersException | TooHighPassengersException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehi.add(new Coche(4, "Mercedes", "Benz", "2019", 301));
        } catch (TooLowPassengersException | TooHighPassengersException e) {
            System.out.println(e.getMessage());
        }

        vehi.add(new Moto(2, "Aprilla", "Sr Gt Sport", "2018", 65));
        vehi.add(new Moto(1, "KTM", "125 Duke", "2022", 105));
        vehi.add(new Moto(3, "KYMCO", "CV3", "2017", 131));
        vehi.add(new Moto(4, "Qooder", "QV3", "2015", 127));
        
        try {
            vehi.add(new Camion(1, 1120, "Volvo", "FH", "2012", 541));
        } catch (TooLowAxlesException | TooHighAxlesException e) {
            System.out.println(e.getMessage());

        }
        try {
            vehi.add(new Camion(4, 1500, "Mercedes", "Actros", "2024", 412));
        } catch (TooLowAxlesException | TooHighAxlesException e) {
            System.out.println(e.getMessage());

        }
        try {
            vehi.add(new Camion(14, 2350, "DAF", "FT", "2016", 310));
        } catch (TooLowAxlesException | TooHighAxlesException e) {
            System.out.println(e.getMessage());

        }

        try {
            vehi.add(new Camion(7, 2600, "MAN", "TGX", "2020", 610));
        } catch (TooLowAxlesException | TooHighAxlesException e) {
            System.out.println(e.getMessage());

        }

        listarCompleto(vehi);
        repostar4Pasajeros(vehi);
        maxEjesyMenosEjes(vehi);
        motoMenosRuedas(vehi);
        mediaDeKmRestantes(vehi);
        eliminarMotos(vehi);
        eliminarUltCoche(vehi);
    }

    public static void listarCompleto(List<Vehiculo> vehi) {
        System.out.println("-------Listando vehículos-------");
        for (Vehiculo vehiculo : vehi) {
            System.out.println(vehiculo);
        }

    }

    public static void repostar4Pasajeros(List<Vehiculo> vehi) {
        System.out.println("-------Repostando vehículos con más de 4 pasajeros-------");
        for (Vehiculo vehiculo : vehi) {
            if (vehiculo instanceof Coche c) {
                if (c.getNumPasajeros() == 4) {
                    c.repostar();
                    System.out.println("Vehículo repostado: " + c);
                }
            }
        }
    }

    public static void maxEjesyMenosEjes(List<Vehiculo> vehi) {
        System.out.println("-------Mostrando el mayor número de ejes y el menor-------");
        String max = "", min = "";
        int maxEjes = Integer.MIN_VALUE, minEjes = Integer.MAX_VALUE;
        for (Vehiculo vehiculo : vehi) {
            if (vehiculo instanceof Camion camion) {
                if (camion.getnEjes() > maxEjes) {
                    max = camion.toString();
                    maxEjes = camion.getnEjes();
                }

                if (camion.getnEjes() < minEjes) {
                    min = camion.toString();
                    minEjes = camion.getnEjes();
                }
            }
        }

        System.out.println("El mínimo de ejes es " + minEjes + " del " + min);
        System.out.println("El máximo de ejes es " + maxEjes + " del " + max);
    }

    public static void motoMenosRuedas(List<Vehiculo> vehi) {
        System.out.println("-------Mostrando moto con menos ruedas-------");
        String motoMenos = "";
        int ruedas = Integer.MAX_VALUE;
        for (Vehiculo vehiculo : vehi) {
            if (vehiculo instanceof Moto m) {
                if (m.getCantidadRuedas() < ruedas) {
                    motoMenos = m.toString();
                    ruedas = m.getCantidadRuedas();
                }
            }
        }
        System.out.println("El mínimo de ruedas es " + ruedas + " del " + motoMenos);
    }

    public static void mediaDeKmRestantes(List<Vehiculo> vehi) {
        System.out.println("-------Mostrando la media de KmRestantes por tipo de vehículo-------");
        int contCoches = 0, kmCoches = 0, contMotos = 0, kmMotos = 0, contCamion = 0, kmCamion = 0;

        for (Vehiculo vehiculo : vehi) {
            if (vehiculo instanceof Coche c) {
                contCoches++;
                kmCoches += c.getKmAutomiaRestantes();
            }
            if (vehiculo instanceof Moto m) {
                contMotos++;
                kmMotos += m.getKmAutomiaRestantes();
            }
            if (vehiculo instanceof Camion m) {
                contCamion++;
                kmCamion += m.getKmAutomiaRestantes();
            }
        }

        System.out.println("La media de kmRestantes de los coches es: " + (kmCoches / contCoches));
        System.out.println("La media de kmRestantes de las motos es: " + (kmMotos / contMotos));
        System.out.println("La media de kmRestantes de los camiones es: " + (kmCamion / contCamion));
    }

    public static void eliminarMotos(List<Vehiculo> vehi) {
        System.out.println("-------Eliminando las motos con menos de 2 ruedas y más de 3-------");
        for (int i = 0; i < vehi.size(); i++) {
            if (vehi.get(i) instanceof Moto m) {
                if (m.getCantidadRuedas() < 2 || m.getCantidadRuedas() > 3) {
                    System.out.println("Moto eliminada: " + m.toString());
                    vehi.remove(m);
                }
            }
        }
    }

    public static void eliminarUltCoche(List<Vehiculo> vehi) {
        System.out.println("----Eliminando ultimo coche----");
            for (int i = vehi.size() - 1; i >= 0; i--) {
                if (vehi.get(i) instanceof Coche c) {
                    System.out.println("Coche borrado" + c);
                    vehi.remove(c);
                    break;
                }
        }
        
    }

}
