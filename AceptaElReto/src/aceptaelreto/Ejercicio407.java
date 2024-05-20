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
public class Ejercicio407 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, p = 0, t = 0, posFinal = 0, pasado = 0, casilla = 0;
        do {
            c = sc.nextInt();
            p = sc.nextInt();
            t = sc.nextInt();
            if (c != 0 && p != 0 && t != 0) {
                posFinal = p + t;
                if (posFinal > c) {
                    pasado = posFinal - c;
                    c = c - pasado;
                    posFinal = c;
                }
                System.out.println(posFinal);
                posFinal = 0;
            }
        } while (c != 0 && p != 0 && t != 0);
    }
}
