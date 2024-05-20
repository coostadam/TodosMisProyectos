/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, numPositivo = 0, numNegativo = 0, numCero = 0;
        for (int n = 1; n <= 10; n++) {
            System.out.print("Dame el número: " + n + ": ");
            num = sc.nextInt();
            if (num > 0) {
                numPositivo++;
            } else if (num == 0) {
                numCero++;
            } else {
                numNegativo++;
            }
        }
        System.out.printf("Hay %d de números positvos, %d números negativos y %d ceros: \n", numPositivo, numNegativo, numCero);

    }
}
