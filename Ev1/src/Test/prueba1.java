/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author dev
 */
import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        
        
        int num1;
        int num2;
        int total;
        Scanner leer = new Scanner (System.in);
        System.out.print("Introduce numero 1: ");
        
        num1 = leer.nextInt();
        
        System.out.print("Introduce numero 2: ");
                
        num2 = leer.nextInt();
        
        total = num1 + num2;
        
        System.out.println(total);
        
        
    }
}
