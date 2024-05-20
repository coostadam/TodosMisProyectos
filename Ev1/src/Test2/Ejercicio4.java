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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Dame un numero entre 100 y 500: ");
        num = Integer.parseInt(sc.nextLine());
        
        if (num >= 100 && num <=500){
            System.out.println("Esta comprendido entre 100 y 500");
        } else {
            System.out.println("No esta comprendido entre 100 y 500");
        }
    }
}
