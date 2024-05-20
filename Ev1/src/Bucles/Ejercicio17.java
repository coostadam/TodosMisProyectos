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
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSuma = 0, num;
        String n;
        do {
            System.out.print("Dime otro número para sumar: ");
            n = sc.nextLine();
            if (!n.equalsIgnoreCase("fin")) {
                num = Integer.parseInt(n);
                nSuma += num;
            }

        } while (!n.equalsIgnoreCase("fin"));
        System.out.println("La suma de los números es: " + nSuma);
    }
}
