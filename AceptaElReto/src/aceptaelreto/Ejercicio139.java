/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dev
 */
public class Ejercicio139 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
            if (n != 0) {
                tratarCaso(n);
            }
        } while (n != 0);
    }

    public static void tratarCaso(int n) {
        Set<Integer> setN = new TreeSet<>();
        boolean es = true;
        setN.add(n);
        System.out.print(n + " -");
        if (n != 1) {
            for (;;) {
                n = sumaCifrasAlCubo(n);
                System.out.print(" " +  n + " -");
                if (n == 1) {
                    break;
                } else if (setN.contains(n)) {
                    es = false;
                    break;
                } else {
                    setN.add(n);
                }
            }
        }
        if (es) {
            System.out.println("> cubinfinito.");
        } else {
            System.out.println("> no cubinfinito.");
        }
    }
    
    public static int sumaCifrasAlCubo(int n) {
        int r = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            r+= Math.pow(Character.getNumericValue(s.charAt(i)), 3);
        }
        return r;
    }
}
