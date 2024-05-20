/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int num;
        System.out.print("Dame un número para saber si es multiplo de 7: ");
        num = Integer.parseInt(sc.nextLine());
        
        if (num % 7 == 0){
            System.out.println("Es multiplo de 7");
        }else {
            System.out.println("No es multiplo de 7");
        }
    }
}
