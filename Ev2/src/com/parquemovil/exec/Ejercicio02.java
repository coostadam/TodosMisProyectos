/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parquemovil.exec;

import com.parquemovil.vehiculos.Coche;
import com.parquemovil.vehiculos.Tractor;
import com.parquemovil.vehiculos.Vehiculo;
import com.parquemovil.excepciones.InvalidKgCargaException;
import com.parquemovil.excepciones.InvalidColorException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dev
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        HashMap<String, Vehiculo> vehiculos = new HashMap<>();

        try {
            vehiculos.put("T01", new Tractor(800, "T01", "Mercedes ", "Actros", 90.23));
        } catch (InvalidKgCargaException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehiculos.put("T02", new Tractor(600, "T02", "Volvo ", "FH", 190));
        } catch (InvalidKgCargaException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehiculos.put("T03", new Tractor(5500, "T03", "DAF ", "FT", 200));
        } catch (InvalidKgCargaException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehiculos.put("T04", new Tractor(1000, "T04", "MAN ", "TGX", 130));
        } catch (InvalidKgCargaException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehiculos.put("C01", new Coche("Negro", "C01", "Seat", "Ibiza", 190));
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }
        try {
            vehiculos.put("C02", new Coche("Rojo", "C02", "Mercedes", "AMG", 320.10));
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehiculos.put("C03", new Coche("Negro", "C03", "BMW", "M3", 220));
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        try {
            vehiculos.put("C04", new Coche("Blanco", "C04", "Ferrari", "LaFerrari", 313));
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        }

        listarVehiculos(vehiculos);
        repostarKgMax750(vehiculos);
        mediaKmCoches(vehiculos);
        borrarCochesBlancos(vehiculos);
        listarVehiculos(vehiculos);

    }

    public static void listarVehiculos(HashMap<String, Vehiculo> vehiculos) {
        System.out.println("-------Listando vehículos-------");
        for (String key : vehiculos.keySet()) {
            System.out.println(key + " " + vehiculos.get(key));
        }
    }

    public static void repostarKgMax750(HashMap<String, Vehiculo> vehiculos) {
        System.out.println("-------Repostando tractores con más de 750 KG de autonomía-------");
        for (String key : vehiculos.keySet()) {
            if (vehiculos.get(key) instanceof Tractor t) {
                if (t.getKgCargaMaxima() > 750) {
                    t.repostar();
                    System.out.println(t.toString());
                }
            }
        }
    }

    public static void mediaKmCoches(HashMap<String, Vehiculo> vehiculos) {
        System.out.println("-------Mostrando la media de KM de autonomia agrupado por color-------");
        double autonomiaBlancos = 0, autonomiaNegros = 0;
        int contBlancos = 0, contNegros = 0;
        for (String key : vehiculos.keySet()) {
            if (vehiculos.get(key) instanceof Coche c) {
                if (c.getColor().equals("Negro")) {
                    contNegros++;
                    autonomiaNegros += c.getKmAutonomia();
                } else if (c.getColor().equals("Blanco")) {
                    contBlancos++;
                    autonomiaBlancos += c.getKmAutonomia();
                }
            }
        }

        System.out.println("La media de km de autonomia de los coches negros es: " + (autonomiaNegros / contNegros));
        System.out.println("La media de km de autonomia de los coches blancos es: " + (autonomiaBlancos / contBlancos));
    }

    public static void borrarCochesBlancos(HashMap<String, Vehiculo> vehiculos) {
        System.out.println("-------Borrando coches blancos-------");
        ArrayList<String> keyBorrado = new ArrayList<>();
        for (String key : vehiculos.keySet()) {
            if (vehiculos.get(key) instanceof Coche c) {
                if (c.getColor().equals("Blanco")) {
                    keyBorrado.add(key);
                }
            }
        }

        for (String key : keyBorrado) {
            System.out.println("Vehiculo borrado: " + vehiculos.get(key));
            vehiculos.remove(key);
        }
    }

}