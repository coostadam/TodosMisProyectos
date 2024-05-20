/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String binario, binario1;

        do {
            binario = "";
            binario1 = "";
            n = sc.nextInt();
            if (n != 0) {
                binario = Integer.toBinaryString(n);
                int n1 = Integer.numberOfTrailingZeros(Integer.parseInt(binario));
                for (int i = 0; i < n1; i++) {
                    binario = "0" + binario;
                }
                for (int i = 0; i < binario.length(); i++) {
                    binario1 = binario.charAt(i) + binario1;

                }
                if (binario.equals(binario1)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }

        } while (n != 0);
    }
}
