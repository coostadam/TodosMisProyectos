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
public class Ejercicio03 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Número de argumentos incorrectos");
        } else {
            File newDir = new File(args[0]);
            if (newDir.exists()) {
                System.out.println("El directorio ya existe.");
            } else {
                if (newDir.mkdir()) {
                    System.out.println(args[0] + " creado correctamente");
                } else {
                    System.out.println("No se ha podido crear el directorio" + args[0]);
                }
            }
        }
    }

}
