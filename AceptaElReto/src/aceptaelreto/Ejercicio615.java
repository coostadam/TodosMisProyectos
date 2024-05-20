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
public class Ejercicio615 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba, pasos, factor, tiempo, resultado;
        casosPrueba = sc.nextInt();
        for (int i = 0; i < casosPrueba; i++) {
            pasos = sc.nextInt();
            factor = sc.nextInt();
            tiempo = sc.nextInt();
            pasos++;
            resultado = tiempo % pasos * factor;
            System.out.println(resultado);

        }
    }
}
