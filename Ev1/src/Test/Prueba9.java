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
public class Prueba9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int eurosIn, billete500, billete100, billete50, billete20, moneda, resto;
        
        System.out.print("Dame los euros iniciales: ");
        
        eurosIn = Integer.parseInt(sc.nextLine()); 
        
        billete500 = eurosIn / 500;
        
        resto = eurosIn % 500;
        
        billete100 = resto / 100; 
        
        resto = resto % 100; 
        
        billete50 = resto / 50; 
        
        resto = resto % 50; 
        
        billete20 = resto / 20; 
        
        resto = resto % 20; 
        
        moneda = resto / 1;  
        
        System.out.printf("Habria %d billetes de 500, %d billetes de 100, %d billetes de 50, %d billetes de 20, %d monedas de uno \n ", billete500, billete100, billete50, billete20, moneda);
        
        
        
                
                
    }
}
