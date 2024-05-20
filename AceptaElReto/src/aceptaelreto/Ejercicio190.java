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
public class Ejercicio190 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        long fact1 = 1;
        do {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (n1 >= n2) {
                for (int i = n1; i > n2; i--) {
                    fact1 *= i;
                }
                System.out.println(fact1);
                fact1 = 1;
            }

        } while (n1 >= n2);
    }
}
