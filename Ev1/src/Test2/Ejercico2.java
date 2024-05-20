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
public class Ejercico2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num; 
        System.out.println("Dame un número");
        num = Integer.parseInt(sc.nextLine());
        
        if (num > 0){
            System.out.println("Es positivo");
        } else if (num < 0 ){
            System.out.println("Es negativo");
        } else {
            System.out.println("El numero es 0");
        }
        
    }
}
