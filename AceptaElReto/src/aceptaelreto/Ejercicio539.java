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
public class Ejercicio539 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anyo1, anyo2, decada;
        while (sc.hasNext()) {
            anyo1 = sc.nextInt();
            anyo2 = sc.nextInt();
            decada = (anyo2 - anyo1) % 10;
            if (decada != 9) {
                System.out.println("TOCA ESPERAR");
            }else{
                System.out.println("FELIZ DECADA NUEVA");
            }
        }
    }
}
