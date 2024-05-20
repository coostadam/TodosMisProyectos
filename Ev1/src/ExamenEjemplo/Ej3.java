/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjemplo;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int n;
        do {
            System.out.print("Dame un número:  ");
            n = sc.nextInt();
            if (n > 0) {
                array = new int[n][n];

                rellenarArray(array);
                mostrarArray(array);
            }

        } while (n > 0);
        System.out.println("Adiós!!!");
    }

    public static void rellenarArray(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {

                if (fila == columna) {
                    array[fila][columna] = 1;
                } else {
                    array[fila][columna] = 0;
                }
                if (fila == 0) {
                    array[fila][columna] = 1;
                }
                if (columna == 0) {
                    array[fila][columna] = 1;
                }
                if (fila == array.length - 1) {
                    array[fila][columna] = 1;
                }
                if (columna == array.length - 1) {
                    array[fila][columna] = 1;
                }

            }
        }
    }

    public static void mostrarArray(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                System.out.print(array[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
