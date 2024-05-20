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
public class Ejercicio572 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos;
        double nota;
        boolean nueve, cero;
        nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            nueve = false;
            cero = false;
            for (int j = 0; j < 5; j++) {
                nota = sc.nextDouble();
                if (nota == 0) {
                    cero = false;
                } else if (nota >= 9) {
                    nueve = true;
                }
            }
            if (nueve) {
                System.out.println("MEDIA");
            } else if (cero) {
                System.out.println("SUSPENSO DIRECTO");
            } else {
                System.out.println("MEDIA");

            }
        }

    }
}
