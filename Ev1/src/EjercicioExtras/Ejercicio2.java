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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dineroUltRep, kmTotales, precioCarbu, litrosTotales, litrosCien;
        System.out.print("Cuanto dinero te gastaste en tu último repostaje: ");
        dineroUltRep = sc.nextDouble();
        System.out.print("Cuantos kilometros te duro ese deposito: ");
        kmTotales = sc.nextDouble();
        System.out.print("Precio carburante: ");
        precioCarbu = sc.nextDouble();
        litrosTotales = dineroUltRep * precioCarbu;
        litrosCien = obtenerLitrosPorCien(kmTotales, litrosTotales);
        System.out.println("A los 100km gasta: " + litrosCien);
    }

    public static double obtenerLitrosPorCien(double kmTotales, double litrosTotales) {

        return litrosTotales * 100 / kmTotales;

    }

//    public static double obtenerLitrosdeImporte() {
//        return;
//    }
}
