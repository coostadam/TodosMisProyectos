/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosPrueba;
        String linea;
        Map<String, Integer> moda = new HashMap<>();
        do {
            casosPrueba = sc.nextInt();
            if (casosPrueba != 0) {
                for (int i = 0; i < casosPrueba; i++) {
                    linea = sc.next();
                    addInfo(linea, moda);
                }
                comprobarGanador(moda);
            }
            moda.clear();
        } while (casosPrueba != 0);
    }

    public static void addInfo(String linea, Map<String, Integer> moda) {
        if (!moda.containsKey(linea)) {
            moda.put(linea, 1);
        }else{
            moda.put(linea, moda.get(linea) + 1);
        }
    }

    public static void comprobarGanador(Map<String, Integer> moda) {
        int pGanador = Integer.MIN_VALUE;
        String ganador = "";
        for (String temp : moda.keySet()) {
            if (moda.get(temp ) > pGanador) {
                pGanador = moda.get(temp);
                ganador = temp;
            }
        }
        System.out.println(ganador);
    }
}
