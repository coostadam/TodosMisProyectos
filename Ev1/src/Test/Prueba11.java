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
public class Prueba11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strUsu;
            
        System.out.print("Introduce una frase que contengam pueblo: ");
        strUsu = sc.nextLine();
        strUsu = strUsu.replaceAll("Pueblo", "Léganes");
        System.out.println(strUsu);
    }
}
