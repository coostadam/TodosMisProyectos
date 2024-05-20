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
public class Ejercicio506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v1, v2, barra;
        int valor1, valor2, nCasos;
        nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            v1 = sc.next();
            barra = sc.next();
            v2 = sc.next();
            valor1 = Integer.valueOf(v1);
            valor2 = Integer.valueOf(v2);
            if (valor1 >= valor2){
                System.out.println("BIEN");
            }else {
                System.out.println("MAL");
            }
        }

    }
}
