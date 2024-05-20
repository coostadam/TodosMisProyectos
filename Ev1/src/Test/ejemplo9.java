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
public class ejemplo9 {
    public static void main(String[] args) {
        Scanner leerusu = new Scanner (System.in);
        System.out.print("Dame un número entero: ");
        int n = Integer.parseInt(leerusu.nextLine());
        System.out.print("Dame un número decimal: ");
        double d = Double.parseDouble(leerusu.nextLine());
        System.out.print("Dame un texto: ");
        String str = leerusu.nextLine();
        
        
        System.out.printf("El número entero es %d y el numero decimal es %f y el texto introducido es: %s \n"  , n, d, str);
    }
}
