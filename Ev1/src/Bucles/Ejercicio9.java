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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1; 
        double nota;
        for(int i = 1; cont <= 20; i++){
            System.out.print("Dame la nota del alumno" + i + ": ");
            nota = sc.nextInt();
            if (nota >= 5){
                System.out.println("Aprobado");
            }else{
                System.out.println("Suspenso");
            }
            cont++;
        }
    }
}
