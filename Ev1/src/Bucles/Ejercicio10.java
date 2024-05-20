/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0, transitoCero = 0, ultMinCero = 0, ultCoche = 0, totalCoches, cochesPasados = 0;
        
        while (hora <= 24){
            System.out.print("¿Cuantos coches pasarón coches en la hora" + hora + " ?: ");
            totalCoches = sc.nextInt();
            if (totalCoches != 0){
                cochesPasados += totalCoches;
                ultCoche = hora;
            }else {
                transitoCero++;
                ultMinCero++;
            }
           hora++;
        }
        System.out.printf("El ultimo coche paso en la hora %d, pasaron %d coches, y hubieron %d horas sin coches.", ultCoche, cochesPasados, transitoCero);
    }
}
