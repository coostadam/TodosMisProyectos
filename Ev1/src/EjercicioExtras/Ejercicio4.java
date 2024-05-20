/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtras;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dia1 = 0, dia2 = 0, media, necesitan = 0;
        System.out.print("Dime la media de la pareja ganadora: ");
        media = sc.nextDouble();
        System.out.print("Dame la puntuacion de la pareja del dia 1: ");
        dia1 = sc.nextDouble();
        System.out.print("Dame la puntuacion de la pareja del dia 2: ");
        dia2 = sc.nextDouble();

        necesitan = media * 3 - (dia1 + dia2);

        System.out.println("La segunda pareja necesita " + necesitan + " puntos");
    }
}

