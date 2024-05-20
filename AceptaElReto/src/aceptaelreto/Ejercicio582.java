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
public class Ejercicio582 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba = Integer.parseInt(sc.nextLine());
        int contador = 0;
        for (int i = 0; i < casosPrueba; i++) {
            for (int j = 0; j < 12; j++) {
                String s1 = sc.nextLine();
                if (s1.contains("doong")) {
                    contador++;
                }
                if (s1.contains("ding-dong")) {
                    System.out.println("SALIDA NULA");
                } else if (s1.equals("")) {
                    System.out.println("MARISA NARANJO");
                }
                if (contador >= 12 && !s1.contains("ding-dong")) {
                    System.out.println("CORRECTO");
                } else if (contador < 12 && s1.contains("ding-dong")) {
                    System.out.println("TARDE");
                }
            }
        }
    }
}
