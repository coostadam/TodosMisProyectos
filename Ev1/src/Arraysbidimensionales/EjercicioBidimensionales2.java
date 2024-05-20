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
public class EjercicioBidimensionales2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int fila, columna;
        System.out.print("Dame las filas que deseas que tenga:  ");
        fila = sc.nextInt();
        System.out.print("Dame las columnas que deseas que tenga:  ");
        columna = sc.nextInt();
        array = new int[fila][columna];

        rellenarArray(array);
        mostrarArray(array);
        sumaArrays(array);

        System.out.println("----Array valores aleatorios----");
        rellenarArrayAleatorio(array);
        mostrarArray(array);
        sumaArrays(array);
        System.out.println("-------------Suma Filas--------------");
        int[] sumaFilas = sumaFilas(array);
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println("La suma de la fila " + i + " es: " + sumaFilas[i]);
        }
        System.out.println("-------------Suma columnas--------------");
        int[] sumaColumnas = sumaColumnas(array);
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println("La suma de la columna " + i + " es: " + sumaColumnas[i]);
        }
    }

    public static void rellenarArray(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                array[fila][columna] = 5;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                System.out.print(array[fila][columna] + " \t");
            }
            System.out.println();
        }
    }

    public static void rellenarArrayAleatorio(int[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                array[fila][columna] = aleatorio(0, 9);
            }
        }
    }

    public static int sumaArrays(int[][] array) {
        int resu = 0;
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[fila].length; columna++) {
                resu += array[fila][columna];
            }
        }
        System.out.println("La suma de los valores del array es " + resu);
        return resu;
    }

    public static int[] sumaColumnas(int[][] a) {
        int[] suma = new int[a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[j] += a[i][j];
            }
        }
        return suma;
    }

    public static int[] sumaFilas(int[][] a) {
        int[] suma = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[i] += a[i][j];
            }
        }
        return suma;
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }
}
