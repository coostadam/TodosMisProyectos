/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.costa.dao.ui;

import com.examen.costa.dao.implementations.CasaDAOimpl;
import com.examen.costa.dao.pojo.Casa;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) {
        int contRegistros = 0;
        Casa c;
        boolean exe;
        File f = new File("./Casa.csv");

        try (Scanner scFile = new Scanner(f);
                CasaDAOimpl impl = new CasaDAOimpl();
                ) {
            impl.deleteRegistros();
            while (scFile.hasNextLine()) {
                String[] datos = scFile.nextLine().split(",");
                c = new Casa(datos[0], datos[1], datos[2], datos[3]);
                contRegistros += impl.addRegistro(c);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Se han añadido: " + contRegistros);
    }
}
