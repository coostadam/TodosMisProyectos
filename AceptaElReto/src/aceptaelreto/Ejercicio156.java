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
public class Ejercicio156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piso, piso2, cont;
        piso = sc.nextInt();
        while(piso >= 0){
            piso2 = sc.nextInt();
            cont = 0;
            while(piso2 >= 0){
                cont += Math.abs(piso-piso2);
                piso = piso2;
                piso2 = sc.nextInt();
            }
            System.out.println(cont);
            piso = sc.nextInt();
        }
    }
}

