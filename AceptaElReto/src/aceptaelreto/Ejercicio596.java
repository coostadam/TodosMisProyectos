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
public class Ejercicio596 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, res = "";
        
        while (sc.hasNext()) {
            s1 = sc.nextLine();

            for (int i = 0; i < s1.length() - 1; i++) {
                if (s1.charAt(i + 1) == '.' && s1.charAt(i) != '.'&& s1.charAt(i + 2) == '.') {
                    res += s1.charAt(i);
                }
            }
            System.out.println(res);
            res = "";
        }
    }
}
