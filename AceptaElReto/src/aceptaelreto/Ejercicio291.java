/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author dev
 */
public class Ejercicio291 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, TreeSet<Integer>> frase = new TreeMap<String, TreeSet<Integer>>();
        String[] palabras;
        int nCasos;
        do {
            nCasos = Integer.parseInt(sc.nextLine());
            if (nCasos != 0) {
                for (int i = 1; i <= nCasos; i++) {
                    palabras = sc.nextLine().toLowerCase().split(" ");
                    for (String palabra : palabras) {
                        if (palabra.length() > 2) {
                            if (!frase.containsKey(palabra)) {
                                frase.put(palabra, new TreeSet<Integer>());
                            }
                            frase.get(palabra).add(i);
                        }
                    }
                }
                for (String f : frase.keySet()) {
                    System.out.print(f);
                    for (Integer n : frase.get(f)) {
                        System.out.print(" " + n);
                    }
                    System.out.println();
                }
                System.out.println("----");
            }
            frase.clear();
        } while (nCasos != 0);
    }
}
