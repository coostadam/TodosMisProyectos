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
public class Ejercicio216 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, segundosTotales, horas, minutos, segundos;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int seg = sc.nextInt();

            segundosTotales = seg;

            horas = segundosTotales / 3600;
            segundosTotales %= 3600;

            minutos = segundosTotales / 60;
            segundosTotales %= 60;

            segundos = segundosTotales;

            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        }
    }
}
