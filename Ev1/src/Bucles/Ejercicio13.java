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
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUser , sumaNums = 0;
        System.out.print("Dame un numero: ");
        numUser = sc.nextInt();
        for(int n = 1; n <= numUser;n++){
            System.out.print(n);
            if(n < numUser){
                System.out.print(" + ");
            }
            sumaNums += n;       
        }
        System.out.printf( " = %d \n" , sumaNums);
            
    }
}
