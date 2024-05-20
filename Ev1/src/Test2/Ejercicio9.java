/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, tipoEnfermedad;
        System.out.print("Ingrese la edad del paciente: ");
        edad = sc.nextInt();

        System.out.print("Ingrese el tipo de enfermedad (1, 2, 3 o 4): ");
        tipoEnfermedad = sc.nextInt();

        double costoDiario = 0;

        switch (tipoEnfermedad) {
            case 1:
                costoDiario = 25;
                break;
            case 2:
                costoDiario = 16;
                break;
            case 3:
                costoDiario = 20;
                break;
            case 4:
                costoDiario = 32;
                break;
            default:
                System.out.println("Tipo de enfermedad no válido.");

        }

        double costoTotal = costoDiario;

        if (edad >= 14 && edad <= 22) {

            costoTotal = costoDiario * 1.10d;
        }

        System.out.println("El coste total de la estancia del paciente es: " + costoTotal + "€");

    }
}
