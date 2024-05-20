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
public class Ejercicio538 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        String numero1, numero2;

        do {
            numero1 = sc.next();
            n1 = Integer.parseInt(numero1);
            numero2 = sc.next();
            n2 = Integer.parseInt(numero2);
            if (!(n1 == 0 && n2 == 0)) {
                if (n1 >= n2) {
                    System.out.println("CUERDO");
                } else {
                    System.out.println("SENIL");
                }

            }
        } while (!(n1 == 0 && n2 == 0));

    }
}
