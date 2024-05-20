/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjemplo;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        boolean colegas = false;
        do {

            System.out.print("Introduce un número: ");
            n1 = sc.nextInt();
            System.out.print("Introduce un número: ");
            n2 = sc.nextInt();
            if (!(n1 == 0 && n2 == 0)) {
                colegas = sonColegas(n1, n2);

                if (colegas) {
                    System.out.println("Son colegas.");
                } else {
                    System.out.println("No son colegas.");
                }
            }

        } while (!(n1 == 0 && n2 == 0));
        System.out.println("Adiós!!!");

    }

    public static boolean sonColegas(int n1, int n2) {
        int sumaColegas = 0;
        sumaColegas = n1 + n2;
        String colegasString = String.valueOf(sumaColegas);
        char num1;
        num1 = colegasString.charAt(0);

        for (int j = 0; j < colegasString.length(); j++) {
            if (num1 != colegasString.charAt(j)) {
                return false;
            } 
        }
        return true;
    }
}
