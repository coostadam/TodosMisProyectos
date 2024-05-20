/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.files;

import java.io.File;

/**
 *
 * @author dev
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        String name;
        File dir;
        if (args.length == 0) {
            name = ".";
        } else {
            name = args[0];
        }

        dir = new File(name);

        if (!dir.exists()) {
            System.out.println("No existe");
        } else if (dir.isFile()) {
            System.out.println("Es un fichero");
        } else {
            File[] listFile = dir.listFiles();
            for (File file : listFile) {
                System.out.println(file.getName());
                System.out.println("Lectura: " + file.canRead());
                System.out.println("Escritura: " + file.canWrite());
                System.out.println("Ejecución: " + file.canExecute());
                System.out.println("Directorio: " + file.isDirectory());
            }
        }

    }
}
