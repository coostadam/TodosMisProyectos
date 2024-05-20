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
public class Ejercicio474 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos = 0, s, a, b, distancia = 0;
        nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            s = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            if (s < a) {
                distancia = a - s;
                distancia += b - a;
            } else {
                distancia = s - a;
                distancia += b - a;
            }
            System.out.println(distancia);
        }
        distancia = 0;

    }
}
