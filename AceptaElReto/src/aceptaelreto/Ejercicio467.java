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
public class Ejercicio467 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2, palabra3;
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            palabra1 = sc.next();
            palabra2 = sc.next();
            palabra3 = sc.next();
            if (palabra1.equalsIgnoreCase(palabra3)) {
                System.out.println("TAUTOLOGIA");
            }else{
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}
