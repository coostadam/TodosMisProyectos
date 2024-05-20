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
public class Ejercicio595 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            char r, r2, r3, r4;
            num = sc.nextLine();
            int longi = num.length();
            if (longi == 3) {
                r = num.charAt(0);
                System.out.println(r);
            }
            if (longi == 4) {
                r = num.charAt(0);
                r2 = num.charAt(1);
                System.out.println(r + "" + r2);
            }
            if (longi == 5) {
                r = num.charAt(0);
                r2 = num.charAt(1);
                r3 = num.charAt(2);
                System.out.println(r + "" + r2 + "" + r3);
            }
            if (longi == 6) {
                r = num.charAt(0);
                r2 = num.charAt(1);
                r3 = num.charAt(2);
                r4 = num.charAt(3);
                System.out.println(r + "" + r2 + "" + r3 + "" + r4);
            }

        }
    }
}
