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
public class Ejercicio605 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contVerano = 0, contInvierno = 0, contAmbas = 0;
        String resp = "";
        do {
            resp = sc.nextLine();
            if (!resp.equalsIgnoreCase(".")) {
                for (int i = 0; i < resp.length(); i++) {
                    if (resp.charAt(i) == 'V') {
                        contVerano++;
                    } else if (resp.charAt(i) == 'I') {
                        contInvierno++;
                    } else if (resp.charAt(i) == 'A') {
                        contVerano++;
                        contInvierno++;
                    }
                }
                if (contVerano > contInvierno) {
                    System.out.println("VERANO");
                } else if (contInvierno > contVerano) {
                    System.out.println("INVIERNO");
                } else {
                    System.out.println("EMPATE");
                }

                contVerano = 0;
                contInvierno = 0;
                contAmbas = 0;
            }

        } while (!resp.equalsIgnoreCase("."));
    }
}
