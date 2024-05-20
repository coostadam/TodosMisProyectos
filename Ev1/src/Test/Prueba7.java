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
public class Prueba7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double n1, n2, n3, n4, n5, media; 
         System.out.print("Dame la nota 1: ");
         n1 = Double.parseDouble(sc.nextLine());
         System.out.print("Dame la nota 2: ");
         n2 = Double.parseDouble(sc.nextLine());
         System.out.print("Dame la nota 3: ");
         n3 = Double.parseDouble(sc.nextLine());
         System.out.print("Dame la nota 4: ");
         n4 = Double.parseDouble(sc.nextLine());
         System.out.print("Dame la nota 5: ");
         n5 = Double.parseDouble(sc.nextLine());
         
         media = (n1 + n2 + n3 + n4 + n5)/ 5; 
          System.out.println("La media es: " + media);
    }
}
