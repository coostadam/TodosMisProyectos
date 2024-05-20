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
public class Ejercicio532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, n2, nResta;
        String numero1, numero2;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            numero1 = sc.next();
            n1 = Integer.parseInt(numero1);
            numero2 = sc.next();
            n2 = Integer.parseInt(numero2);
            if (n1 < n2) {
                nResta = n2 - n1;
            } else {
                nResta = n1 - n2;
            }
            
            System.out.println(nResta);

        }
    }
}
