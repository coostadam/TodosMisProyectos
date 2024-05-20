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
public class Ejercicio512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double caballo, conejo, resultado;
        int nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            conejo = sc.nextDouble();
            caballo = sc.nextDouble();
            resultado = conejo*100d/(conejo + caballo);
            System.out.println((int)resultado);
        }
    }
}
