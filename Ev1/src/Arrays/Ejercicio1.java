/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aInt1 = new int[20];
        for (int i = 0; i < aInt1.length; i++) {
            aInt1[i] = aleatorio(-10, 10);
            System.out.println("El número en la posición " + i + " es: " + aInt1[i]);

        }
        System.out.println("-------Sustituimos los inferiores a 0-------");
        for (int j = 0; j < aInt1.length; j++) {
            if (aInt1[j] < 0) {
                aInt1[j] = 1;
            }
            System.out.println("El número en la posición " + j + " es: " + aInt1[j]);
        }
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }
}
