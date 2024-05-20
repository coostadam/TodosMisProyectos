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
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,nAcciones = 0;
        System.out.print("Dame el número a dividir: ");
        n = sc.nextInt();
        while(n >= 3){
 
            n = n / 3;
            nAcciones++;
            System.out.println(n);
      
        }
        System.out.println("Se a realizado " + nAcciones + " veces");
    }
}
