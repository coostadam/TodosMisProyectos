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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMes, ano;
        System.out.print("Dame el numero de mes: ");
        numMes = sc.nextInt();
        System.out.print("¿De que año? ");
        ano = sc.nextInt();
        if (numMes == 1) {
            System.out.println("Enero");
        } else if (numMes == 2) {
            System.out.println("Febrero");
        } else if (numMes == 3) {
            System.out.println("Marzo");
        } else if (numMes == 4) {
            System.out.println("Abril");
        } else if (numMes == 5) {
            System.out.println("Mayo");
        } else if (numMes == 6) {
            System.out.println("Junio");
        } else if (numMes == 7) {
            System.out.println("Julio");
        } else if (numMes == 8) {
            System.out.println("Agosto");
        } else if (numMes == 9) {
            System.out.println("Septiembre");
        } else if (numMes == 10) {
            System.out.println("Octubre");
        } else if (numMes == 11) {
            System.out.println("Noviembre");
        } else {
            System.out.println("Diciembre");
        }
        if (ano % 4 == 0 || ano % 100 != 0 || ano % 400 != 0){
            System.out.println("Bisiesto");
        }else {
            System.out.println("Año común");
        }
    }
}
