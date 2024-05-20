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
public class Ejercicio481 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = 0, columna = 0;
        fila = sc.nextInt();
        columna = sc.nextInt();
        while (!(fila == 0 && columna == 0)) {

          
                if (fila == 1) {
                    System.out.println("h" + columna);
                } else if (fila == 2) {
                    System.out.println("g" + columna);

                } else if (fila == 3) {
                    System.out.println("f" + columna);

                } else if (fila == 4) {
                    System.out.println("e" + columna);

                } else if (fila == 5) {
                    System.out.println("d" + columna);

                } else if (fila == 6) {
                    System.out.println("c" + columna);

                } else if (fila == 7) {
                    System.out.println("d" + columna);

                } else if (fila == 8) {
                    System.out.println("a" + columna);

                
                fila = sc.nextInt();
                columna = sc.nextInt();
            }
        }

    }
}
