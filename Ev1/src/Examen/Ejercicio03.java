/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nUsu;
        int n, i, j;
        int[][] arrayBi;
        do {
            System.out.print("Introduce un número n: ");
            nUsu = sc.nextLine();
            if (!nUsu.equalsIgnoreCase("fin")) {
                n = Integer.parseInt(nUsu);
                arrayBi = new int[n][n];
                rellenarArrayAleatorio(arrayBi);
                mostrarArray(arrayBi);

                System.out.print("Introduce un número: ");
                i = Integer.parseInt(sc.nextLine());

                System.out.print("Introduce un número: ");
                j = Integer.parseInt(sc.nextLine());

                System.out.println("El número guardado en i, j es: " + arrayBi[i][j]);

                double mediaColumna = mediaColumnas(arrayBi, j, n);
                System.out.println("La media de los números de esa columna es: " + mediaColumna);

                double mediaFila = mediaFilas(arrayBi, i, n);
                System.out.println("La media de los números de esa fila es: " + mediaFila);

            }
        } while (!nUsu.equalsIgnoreCase("fin"));
        System.out.println("Adiós!!!");
    }

    public static void rellenarArrayAleatorio(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                array[fila][columna] = aleatorio(0, 9);
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                System.out.print(array[fila][columna] + "\t");
            }
            System.out.println();
        }
    }

    public static double mediaColumnas(int[][] a, int columna, int n) {
        double sumaMedia = 0;
        for (int i = 0; i < a.length; i++) {
            sumaMedia += a[i][columna];
        }
        return sumaMedia / n;
    }

    public static double mediaFilas(int[][] a, int fila, int n) {  
        double sumaMedia = 0;
        for (int i = 0; i < a.length; i++) {
            sumaMedia += a[fila][i];
        }
        return sumaMedia / n;
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}