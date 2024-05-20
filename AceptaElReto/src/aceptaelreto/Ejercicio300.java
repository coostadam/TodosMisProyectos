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
public class Ejercicio300 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos;
        String txt;
        nCasos = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < nCasos; i++) {
            txt = sc.nextLine();
            if (txt.contains("a") && txt.contains("e") && txt.contains("i")
                    && txt.contains("o") && txt.contains("u")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }
}
