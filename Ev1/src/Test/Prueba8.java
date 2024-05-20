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
public class Prueba8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            int n, resultado; 
            System.out.print("Dame un número entero: ");
            n = Integer.parseInt(sc.nextLine());
            
            resultado = suma(n); 
            System.out.println(resultado);
    }
    public static int suma(int n1){
    
    return (n1 * (n1 + 1)) / 2;
    
    }
}
