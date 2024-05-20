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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 20, totalMayores = 0, edad;
        
        for(int i = 1; i <= cont; i++){
            System.out.print("Dame la edad de la persona " + i + ": ");
            edad = sc.nextInt();
            if (edad >= 18){
                totalMayores++;
            }
        }
        System.out.printf("Hay %d mayores de edad /n", totalMayores);
    }
}
