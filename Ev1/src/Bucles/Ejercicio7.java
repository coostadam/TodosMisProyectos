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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        double nota = 0, total = 0, media;
        
        while(contador < 21){
            System.out.print("Dame la nota del alumno " + contador + " : ");
            nota = sc.nextDouble(); 
            total = total + nota;
            contador++;
        }
        media = total / 20;
        System.out.println("La nota media es: " + media);
    }
    
    
}
