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
public class Ejercicio02 {
    public static void main(String[] args) {
        String name;
        File file;
        if (args.length == 0) {
            name = ".";
        } else {
            name = args[0];
        }
        file = new File(name);
        System.out.println("Nombre" + file.getName());
        System.out.println("Ruta" + file.getPath());
        System.out.println("Ruta absoluta" + file.getAbsolutePath());
        System.out.println("¿Es un fichero? " + file.isFile());
        System.out.println("¿Es un dir? " + file.isDirectory());
        System.out.println("Permisos de lectura " + file.canRead());
        System.out.println("Permisos de escritura " + file.canWrite());
        System.out.println("Permisos de ejecución" + file.canExecute());
        System.out.println("Tamaño en bytes " + file.length());
        System.out.println("¿Cual es su padre? " + file.getParent());
    }
}
