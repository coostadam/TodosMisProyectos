/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arraysbidimensionales;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Prueba1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] salida;
        int n;
        int a = 0;

        do {
            System.out.print("Cuantas veces quieres que se ejecute: ");
            n = sc.nextInt();
            salida = new char[n][n];
            if (n > 0) {
                for (int fila = 0; fila < salida.length; fila++) {
                    for (int columna = 0; columna < salida[fila].length; columna++) {
                        if (fila == columna) {
                            salida[fila][columna] = 'A';
                        }  else {
                            salida[fila][columna] = '*';
                        }
                    }
                }
                mostrarResultado(salida);

            }

        } while (n > 0);
        System.out.println("FIN!!!");
    }

    public static void mostrarResultado(char[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                System.out.print(array[fila][columna] + "");
            }
            System.out.println();
        }

    }
}
