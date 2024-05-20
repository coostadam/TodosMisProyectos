/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dev
 */
public class Ejercicio185 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos;
        String respuesta;
        Set<String> ingredienteSI = new TreeSet<>();
        Set<String> ingredienteNO = new TreeSet<>();

        do {
            nCasos = Integer.parseInt(sc.nextLine());
            if (nCasos != 0) {
                for (int i = 0; i < nCasos; i++) {
                    do {
                        respuesta = sc.next();
                        if (!respuesta.equals("FIN")) {
                            if (respuesta.substring(0, 1).equals("SI")) {
                                System.out.println("si");
                            } else if (respuesta.substring(0, 1).equals("NO")) {
                                System.out.println("no");
                            }
                        }
                    } while (!respuesta.equals("FIN"));
                }
            }
        } while (nCasos != 0);
    }
}
