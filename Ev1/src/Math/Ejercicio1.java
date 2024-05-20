/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Math;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, maximo, min;

        do {

            System.out.print("Dame el número 1: ");
            n1 = sc.nextInt();
            System.out.print("Dame el número 2: ");
            n2 = sc.nextInt();
            if (!(n1 == 0 || n2 == 0)) {
                maximo = Math.max(n1, n2);
                min = Math.min(n1, n2);
                   
                if (maximo % min == 0) {
                    System.out.println("Son múltiplos");
                } else {
                    System.out.println("No son múltiplos");
                }
            }

        } while (!(n1 == 0 || n2 == 0));
        System.out.println("Adiós!!!");
    }
}
