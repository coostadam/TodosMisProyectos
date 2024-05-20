/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strUsu, resultado = "";

        do {
            System.out.print("Dime una palabra:  ");
            strUsu = sc.nextLine();
            for (int i = 0; i < strUsu.length(); i++) {
                if (!strUsu.equalsIgnoreCase("fin")) {
                    if (i % 2 == 0) {
                        resultado = resultado + Character.toUpperCase(strUsu.charAt(i));
                    } else {
                        resultado = resultado + Character.toLowerCase(strUsu.charAt(i));
                    }
                }
            }
            System.out.println(resultado);
            resultado = "";
        } while (!strUsu.equalsIgnoreCase("fin"));
        System.out.println("Adiós!!!");
    }
}
