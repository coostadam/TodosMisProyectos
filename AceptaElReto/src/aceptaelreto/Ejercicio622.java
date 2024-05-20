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
public class Ejercicio622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, media = 0, mediaNecesita,notaNecesaria, sumDeseo;
        do {
            nCasos = sc.nextInt();
            if (nCasos != 0) {
                for (int i = 0; i < nCasos; i++) {
                    media += sc.nextInt();
                }
                mediaNecesita = sc.nextInt();
                sumDeseo = mediaNecesita * (media + 1);
                notaNecesaria =  sumDeseo - media;
                if (notaNecesaria >= mediaNecesita) {
                    System.out.println(notaNecesaria);
                } else {
                    System.out.println("IMPOSIBLE");
                }
            }
            media = 0;
        } while (nCasos != 0);
    }
}
