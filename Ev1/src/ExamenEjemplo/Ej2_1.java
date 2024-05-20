/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjemplo;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ej2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print("Introduce un número: ");
            n1 = sc.nextInt();
            System.out.print("Introduce un número: ");
            n2 = sc.nextInt();
            if (n1 > 0 && n2 > 0) {
                if (sonColegas(n1, n2)) {
                    System.out.println("SON COLEGAS");
                } else {
                    System.out.println("NO SON COLEGAS");
                }
            }
        } while (n1 > 0 && n2 > 0);
    }

    public static boolean sonColegas(int n1, int n2) {
        String suma = String.valueOf(n1 + n2);
        char caracterUno = suma.charAt(0);
        for (int i = 0; i < suma.length(); i++) {
            if (suma.charAt(i) != caracterUno) {
                return false;
            }
        }
        return true;
    }
}
