/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio372 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos;
        String palabraMary, palabraReves = "";
        nCasos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nCasos; i++) {
            palabraMary = sc.nextLine();
            if (Character.isLowerCase(palabraMary.charAt(0))) {
                for (int j = 0; j < palabraMary.length(); j++) {
                    palabraReves = palabraMary.charAt(j) + palabraReves;
                }
                System.out.println(palabraReves);
            } else {
                palabraMary = palabraMary.toLowerCase();
                for (int j = 0; j < palabraMary.length(); j++) {
                    if (j == palabraMary.length() - 1) {
                        palabraReves = Character.toUpperCase(palabraMary.charAt(j)) + palabraReves;
                    } else {
                        palabraReves = palabraMary.charAt(j) + palabraReves;

                    }

                }
                System.out.println(palabraReves);
            }
            palabraReves = "";
        }

    }
}
