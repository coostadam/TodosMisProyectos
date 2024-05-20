/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nUsu;
        int contBonitos = 0;
        do {
            System.out.print("Número: ");
            nUsu = sc.nextLine();
            if (!nUsu.equalsIgnoreCase("fin")) {
                int n = Integer.parseInt(nUsu);
                n = Math.abs(n);
                nUsu = String.valueOf(n);
                if (esBonito(nUsu)) {
                    System.out.println("Es bonito.");
                    contBonitos++;
                } else {
                    System.out.println("No es bonito.");
                }
            }
        } while (!nUsu.equalsIgnoreCase("fin"));
        System.out.println("La cantidad de numeritos bonitos introducidos por el usuario es: " + contBonitos);
    }

    public static boolean esBonito(String nUsu) {
        int[] nSeparado = new int[nUsu.length()];
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 0; i < nUsu.length(); i++) {
            nSeparado[i] = Character.getNumericValue(nUsu.charAt(i));
        }
        for (int i = 0; i < nSeparado.length; i++) {
            if (nSeparado[i] % 2 == 0) {
                sumaPares += nSeparado[i];
            } else {
                sumaImpares += nSeparado[i];
            }
        }
        if (sumaPares != sumaImpares) {
            return false;
        }
        return true;
    }
}
