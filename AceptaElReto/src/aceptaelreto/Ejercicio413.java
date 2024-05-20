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
public class Ejercicio413 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nAncho, nAlto, total, n, contBlanco = 0, contNegro = 0;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nAncho = sc.nextInt();
            nAlto = sc.nextInt();
            total = nAncho * nAlto;
            contNegro = total / 2;
            contBlanco = total / 2;
            if (total % 2 != 0) {
                contBlanco++;
            }
            System.out.println(contBlanco + " " + contNegro);
        }

    }
}
