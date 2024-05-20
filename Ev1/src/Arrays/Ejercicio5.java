/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nLimite;
        int cont = 0;
        int[] aInt;
        System.out.print("Dame un número: ");
        n = sc.nextInt();
        System.out.print("Dame un número límite: ");
        nLimite = sc.nextInt();
        aInt = new int[n];
        for (int i = 0; i < aInt.length; i++) {
            if (cont < nLimite) {
                aInt[i] = cont;
                cont++;

            } else {
                cont = 0;
                cont++;
            }
            System.out.println("Posición " + i + " : " + aInt[i]);
        }
    }
}
