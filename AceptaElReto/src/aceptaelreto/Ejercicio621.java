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
public class Ejercicio621 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1 = 0;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            n1 = Integer.parseInt(sc.nextLine());
            if (n1 % 2 == 0) {
                System.out.println(n1 += 1);
            } else {
                System.out.println(n1 -= 1);

            }
        }
    }
}
