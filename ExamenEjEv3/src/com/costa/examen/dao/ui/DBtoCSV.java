/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.costa.examen.dao.ui;

import com.costa.examen.dao.biz.CocheBiz;
import com.costa.examen.dao.pojo.Coche;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class DBtoCSV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CocheBiz cb = new CocheBiz();
        String r = "";
        do {
            try {
                getCoche(sc, cb);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.print("¿Quieres generar otro fichero? (S/N) -> ");
            r = sc.nextLine();
        } while (!r.equalsIgnoreCase("N"));
    }

    private static void getCoche(Scanner sc, CocheBiz cb) throws Exception {
        System.out.print("Matricula del vehiculo -> ");
        String matricula = sc.nextLine();
        System.out.print("Marca del vehiculo -> ");
        String marca = sc.nextLine();
        System.out.print("Modelo del vehiculo -> ");
        String modelo = sc.nextLine();
        System.out.print("Color del vehiculo -> ");
        String color = sc.nextLine();

        System.out.print("¿Que nombre quieres para el fichero? -> ");
        String nombreFichero = sc.nextLine();

        List<Coche> al = cb.getCoche(matricula, modelo, marca, color);
        
        for (Coche coche : al) {
            cb.addCsv(nombreFichero + ".csv", coche);
        }
    }
}
