/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio434 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPalomas, nHabitaculos;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nPalomas = sc.nextInt();
            nHabitaculos = sc.nextInt();
            if (nPalomas <= nHabitaculos) {
                System.out.println("ROMANCE");
            }else{
                System.out.println("PRINCIPIO");
            }
        }
    }
}
