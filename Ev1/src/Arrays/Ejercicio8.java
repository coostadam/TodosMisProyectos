/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n;
        System.out.print("Dame un número de tope para hacer la serie fibonacci: ");
        n = sc.nextInt();
        a = new int[n];
        a[0] = 1;
        a[1] = 1;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print(" " + a[0]);
            }
            if (i == 1) {
                System.out.print(" " + a[1]);
            }
            if (i >= 2) {
                a[i] = a[i - 1] + a[i - 2];
                System.out.print(" " + a[i]);
            }
        }

    }
}
