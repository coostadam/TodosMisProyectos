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
public class Ejercicio446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, nNombres;
        String nombreNieto;
        String[] nombresNietos;
        nCasos = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        for (int i = 0; i < nCasos; i++) {
            nombreNieto = sc.nextLine();
            nNombres = Integer.parseInt(sc.nextLine());
            nombresNietos = new String[nNombres + 1];
            for (int j = 0; j < nNombres + 1; j++) {
                nombresNietos[j] = sc.nextLine();
            }
            if (nNombres == 1) {
                System.out.println("FALSA");
            } else if (nombreNieto.equals(nombresNietos[nombresNietos.length - 1])) {
                System.out.println("VERDADERA");
            } else {
                System.out.println("FALSA");
            }
        }
    }
}
