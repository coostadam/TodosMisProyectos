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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] aInt1;
        System.out.print("Cuantos numeros quieres en el array: ");
        n = sc.nextInt();
        aInt1 = new int[n];
        for (int i = 0; i < aInt1.length; i++) {
            aInt1[i] = aleatorio(-10, 10);
            if (aInt1[i] > 0) {
                System.out.println("El número en la posición " + i + " es: " + aInt1[i]);
            }

        }

    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }
}
