/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio709 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> sede = new HashMap<>();
        int nCasos = 0, votos = 0;
        String ganador = "";
        do {
            nCasos = sc.nextInt();
            if (nCasos != 0) {
                for (int i = 0; i < nCasos; i++) {
                    String pais = sc.next();
                    if (sede.containsKey(pais)) {
                        sede.put(pais, sede.get(pais) + 1);
                    } else {
                        sede.put(pais, 1);
                    }
                }

                for (String sede1 : sede.keySet()) {
                    if (sede.get(sede1) > votos) {
                        votos = sede.get(sede1);
                        ganador = sede1;
                    }else if (sede.get(sede1) == votos){
                        ganador = "EMPATE";
                    }
                }
                System.out.println(ganador);
            }
            sede.clear();
            votos = 0;
        } while (nCasos != 0);
    }
}
