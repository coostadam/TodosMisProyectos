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
public class Ejercicio437 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String anuncio = sc.next();
            int hora = Integer.parseInt(anuncio.substring(0, 2));
            int minuto = Integer.parseInt(anuncio.substring(3, 5));
            int segundo = Integer.parseInt(anuncio.substring(6, 8));

            // La hora límite es 12:00:00 menos la duración del anuncio
            int horaLimite = 23 - hora;
            int minutoLimite = (int)Math.floor(59 - minuto);
            int segundoLimite = (int)Math.floor(59 - segundo);

            // Si la hora límite es menor que 0, entonces el anuncio debe comenzar antes de las 0:00:00
            if (horaLimite < 0) {
                horaLimite = 0;
            }

            // Si el minuto límite es menor que 0, entonces el anuncio debe comenzar antes de la misma hora, pero en el minuto siguiente
            if (minutoLimite < 0) {
                horaLimite--;
                minutoLimite = 59;
            }

            // Si el segundo límite es menor que 0, entonces el anuncio debe comenzar antes de la misma hora y minuto, pero en el segundo siguiente
            if (segundoLimite < 0) {
                horaLimite--;
                minutoLimite--;
                segundoLimite = 59;
            }

            // Imprimimos la hora límite
            System.out.println(String.format("%02d:%02d:%02d", horaLimite, minutoLimite, segundoLimite));
        }
    }

}
