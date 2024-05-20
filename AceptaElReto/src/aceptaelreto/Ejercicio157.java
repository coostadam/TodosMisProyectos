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
public class Ejercicio157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, casosPrueba, remaining = 0;

        casosPrueba = sc.nextInt();

        for (; casosPrueba != 0; casosPrueba--) {
            dia = sc.nextInt();
            mes = sc.nextInt();
            if (mes == 12) {
                remaining += 31 - dia;
            } else {
                for (; mes < 12; mes++) {
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
                        remaining += 31;
                    } else if (mes == 2) {
                        remaining += 28;
                    } else {
                        remaining += 30;
                    }
                }
                remaining += 31 - dia;
            }
            System.out.println(remaining);
            remaining = 0;
        }

    }
}
