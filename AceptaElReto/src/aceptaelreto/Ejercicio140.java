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
public class Ejercicio140 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (!(n < 0)) {
            String s1 = String.valueOf(n);
            for (int i = 0; i < s1.length(); i++) {
                if (i != s1.length() - 1) {
                    System.out.print(s1.charAt(i) + " + ");
                } else {
                    System.out.print(s1.charAt(i) + " ");
                }
            }
            System.out.print("= " + sumador(s1));
            System.out.println("");
            n = sc.nextInt();
        }

    }

    public static int sumador(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
}
