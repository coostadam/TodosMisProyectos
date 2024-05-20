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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numMultiplicado;
        System.out.print("Dame el número a multiplicar: ");
        num = sc.nextInt();
        for(int n = 0; n <= 10; n++){
            numMultiplicado = num * n;
            System.out.println(num + " x " + n + " = " + numMultiplicado);
        }
        
    }
}
