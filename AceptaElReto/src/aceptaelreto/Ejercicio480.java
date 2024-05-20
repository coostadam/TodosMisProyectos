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
public class Ejercicio480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();

        for (int i = 0; i < casosPrueba; i++) {
            int uvasTotales = sc.nextInt();
            int factor = sc.nextInt();
            int cadaEstasUvas = sc.nextInt();
            int sum = 0;

            sum += uvasTotales / cadaEstasUvas * factor;
            if (uvasTotales % cadaEstasUvas > factor) {
                sum += factor;
            } else {
                sum += uvasTotales % cadaEstasUvas;
            }
            System.out.println(sum);
        }
    }
}
