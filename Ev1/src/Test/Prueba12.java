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
public class Prueba12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textUsu, strFin;
        int num1, num2;
        
        System.out.print("Dame un texto: ");
        textUsu = sc.nextLine();
        System.out.print("Donde es el incio: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Donde es el fin: ");
        num2 = Integer.parseInt(sc.nextLine());
        
        strFin = textUsu.substring(num1, num2);
        
        System.out.println(strFin);
    }
}
