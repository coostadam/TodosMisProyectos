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
public class Prueba5 {
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        int radio;
        double perimetro;
        double pi = 3.14;
       
        System.out.print("Dame el radio de la circunferencia: ");
        radio = pedir.nextInt();
        
        perimetro = 2 * pi * radio;
        
        System.out.println("El perimetro es: " + perimetro);
        
    }
}
