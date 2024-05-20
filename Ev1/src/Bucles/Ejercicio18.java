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
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int nVocal = 0;

        do {
            System.out.print("Dime una palabra para sacar sus caráteres: : ");
            str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                        || str.charAt(i) == 'i') {
                    nVocal++;
                }

            }
            System.out.println("El número de vocales es: " + nVocal);
            nVocal = 0;
        } while (!str.equalsIgnoreCase("fin"));
        System.out.println("Adiós!!!");
    }
}
