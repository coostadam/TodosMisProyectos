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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  edad;
        System.out.print("Dime la edad que desees: ");
        edad = Integer.parseInt(sc.nextLine());
        
        if (edad < 13){
            System.out.println("Es un niño");
        }else if(edad <=16){
            System.out.println("Es un adolescente");
        }else if(edad <=25){
            System.out.println("Es un joven");
        }else{
            System.out.println("Es un adulto");
        }
        
    }
}
