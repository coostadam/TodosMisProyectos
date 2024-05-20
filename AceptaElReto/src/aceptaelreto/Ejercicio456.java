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
public class Ejercicio456 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int ancho = sc.nextInt();
            int alto = sc.nextInt();
            int necesarios = sc.nextInt();
            int sum = 0;
            int j = 1;
            while (true) {
                sum += ancho * alto;
                if (sum >= necesarios) {
                    System.out.println(j);
                    break;
                }
                j++;
            }
        }
    }
}
