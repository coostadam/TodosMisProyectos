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
public class Ejercicio607 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, nVecesCopia, suma = 1, cont = 0;
        nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            nVecesCopia = sc.nextInt();
            if (nVecesCopia > 1) {
                do {
                    if(suma < nVecesCopia){
                        suma *= 2;
                        cont++;
                    }
                } while (suma < nVecesCopia);
                System.out.println(cont);
                cont = 0;
                suma = 1;
            }else{
                System.out.println(cont);
            }

        }
    }
}
