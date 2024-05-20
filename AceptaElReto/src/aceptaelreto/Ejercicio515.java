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
public class Ejercicio515 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nViajes, nCopas;
        do {
            nCopas = sc.nextInt();
            if (!(nCopas == 0)) {
                if (nCopas % 2 != 0) {
                    nViajes = nCopas - 1;
                } else {
                    nViajes = nCopas;
                }
                if(nCopas == 1){
                    nViajes = 1;
                }
                System.out.println(nViajes);
            }

        } while (!(nCopas == 0));
    }
}
