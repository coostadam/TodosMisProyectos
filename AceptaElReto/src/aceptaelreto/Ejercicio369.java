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
public class Ejercicio369 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("1");
                }
                System.out.println();
            }
        } while (n != 0);
    }
}
