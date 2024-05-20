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
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aInt1;
        int n;
        System.out.print("Cuantos números quieres que se generen: ");
        n = sc.nextInt();
        aInt1 = new int[n];
        for (int i = 0; i < aInt1.length; i++) {
            aInt1[i] = aleatorio(-10, 10);
            System.out.println("El número " + i + " es: " + aInt1[i]);
        }
        System.out.println("-----Array dado la vuelta-----");
        n--;
        for (int j = n; j >= 0; j--) {
            System.out.println("El número " + j +  " es: " + aInt1[j]);
        }
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }
}
