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
public class Ejercicio155 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada1, entrada2;
        int n1, n2, perimetro;
        do {
            entrada1 = sc.next();
            entrada2 = sc.next();
            n1 = Integer.parseInt(entrada1);
            n2 = Integer.parseInt(entrada2);
            if (!(n1 < 0 || n2 < 0)) {
                perimetro = (n1*2) + (n2*2);
                System.out.println(perimetro);
            }
        } while (!(n1 < 0 || n2 < 0));
    }
}
