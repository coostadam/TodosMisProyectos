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
public class Ejercicio380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, nGastos, nTotal = 0;
        do {
            nCasos = sc.nextInt();
            if (nCasos != 0) {
                for (int i = 0; i < nCasos; i++) {
                    nGastos = sc.nextInt();
                    nTotal += nGastos;
                }
                System.out.println(nTotal);
                nTotal = 0;
            }

        } while (nCasos != 0);

    }
}
