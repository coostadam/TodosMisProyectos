/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.cifrado;


import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Pon '1' para cifrar un archivo.");
            System.out.println("Pon '2' para descifrar un archivo.");
            System.out.println("Pon 'S' para salir.");
            System.out.print("¿Que quieres hacer? -> ");
            answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("S")) {
                if (answer.equals("1")) {
                    cifrarArchivo(sc);
                } else if (answer.equals("2")) {

                } else {
                    System.out.println("---------------------------");
                    System.out.println("Respuesta incorrecta.");
                    System.out.println("---------------------------");
                }
            }
        } while (!answer.equalsIgnoreCase("S"));
    }

    public static void cifrarArchivo(Scanner sc) throws FileNotFoundException {
        String txt;
        int desp;
        String file;
        System.out.print("Dame el número de desplazamiento -> ");
        desp = Integer.parseInt(sc.nextLine());
        System.out.print("Dame el nombre del fichero  con la extensión que quieres cifrar -> ");
        file = "./" + sc.nextLine();
        txt = CifrarArchivo.cifradorDeArchivos(desp, file);
        System.out.println(txt);
    }
}
