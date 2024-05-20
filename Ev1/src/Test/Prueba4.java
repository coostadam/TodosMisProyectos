/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Prueba4 {
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        int edad;
        int year = 2023; 
        int yearNacimiento;
        System.out.print("Dime tu año de nacimiento: ");
        yearNacimiento = pedir.nextInt();
        
        edad = year - yearNacimiento;
        
        System.out.println(edad);
    }
}
