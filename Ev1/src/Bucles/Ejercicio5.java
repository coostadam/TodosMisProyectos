/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador, total;

        System.out.print("Cuantos articulos hay: ");
        n = sc.nextInt();
        contador = 0;
        total = 0; 
        do {
            System.out.print("Pon precio de articulo " + contador + ": ");   
            int precio = sc.nextInt();
            
            total = total + precio; 
            contador++;
        } while (contador < n);

        System.out.println("El precio total es: " + total);
    }
}
