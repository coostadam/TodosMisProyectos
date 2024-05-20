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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; 
        System.out.print("Dame un número: ");
        num = Integer.parseInt(sc.nextLine());
        
        if (num % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es inpar");
        }
    }
}
