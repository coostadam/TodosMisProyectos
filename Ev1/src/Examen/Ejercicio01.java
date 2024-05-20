/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt, txtMasCambio = "", txtTemp;
        int cont = 0, max = Integer.MIN_VALUE;
        do {
            System.out.print("Introduce una cadena de texto: ");
            txt = sc.nextLine();
            txtTemp = txt;
            String[] separado = txt.split(" ");
            if (!txt.equalsIgnoreCase("fin")) {
                System.out.println("Salida: " + quitarCaracteres(txt, separado));
                for (int i = 0; i < separado.length; i++) {
                    if (separado[i].length() <= 2) {
                        cont++;
                    }
                }
                if (cont > max) {
                    txtMasCambio = txtTemp;
                    max = cont;
                }
                cont = 0;
            }
        } while (!txt.equalsIgnoreCase("fin"));
        System.out.println("Cadena de texto con más palabras quitadas: " + txtMasCambio);
        System.out.println("Adiós!!");
    }

    public static String quitarCaracteres(String txt, String[] separado) {
        String nuevoTxt = "";
        for (int i = 0; i < separado.length; i++) {
            if (separado[i].length() <= 2) {
                    nuevoTxt = "" + nuevoTxt;
               
            } else {
                if (i == 0) {
                    nuevoTxt = separado[i];
                } else {
                    nuevoTxt = nuevoTxt + " " + separado[i];
                }
            }
        }
        return nuevoTxt;
    }
}