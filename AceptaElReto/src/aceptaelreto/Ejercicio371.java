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
public class Ejercicio371 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, lados = 0;
        do {
            n = sc.nextInt();
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    lados += i * 3;
                }
                System.out.println(lados);
                lados = 0;
            }

        } while (n > 0);
    }
}
