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
public class prueba3 {
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        double lado, apotema, perimetro, area;
       
            System.out.print("Dame el lado: ");
                lado = Double.parseDouble(pedir.nextLine());
            System.out.print("Dame el apotema: ");
                apotema = Double.parseDouble(pedir.nextLine());
                    perimetro = 5 * lado;
                  area = (apotema * perimetro)/2; 
            System.out.println("El área es: " + area);
            
    }
}
