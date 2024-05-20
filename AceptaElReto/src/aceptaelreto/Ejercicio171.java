/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio171 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nCasos = 0;
        List<Integer> mon = new ArrayList<>();

        do {
            nCasos = sc.nextInt();
            if (nCasos != 0) {
                for (int i = 0; i < nCasos; i++) {
                    int tamanyo = sc.nextInt();
                    mon.add(tamanyo);
                }
                comprobarMontanya(mon);

            }
            mon.clear();
        } while (nCasos != 0);
       

    }

    public static void comprobarMontanya(List<Integer> mon) {
        int masAlta = mon.get(mon.size() - 1);
        int cont = 1;

        for (int i = mon.size() - 2; i >= 0; i--) {
            if (masAlta < mon.get(i)) {
                masAlta = mon.get(i);
                cont++;
            }
        }
        System.out.println(cont);
    }

}
