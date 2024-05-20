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
public class Ejercicio293 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos, insectos, aracnidos, crustaceos, escolopendras, anillos, totalPatas;

        numCasos = sc.nextInt();

        for (int i = 0; i < numCasos; i++) {
            insectos = sc.nextInt();
            aracnidos = sc.nextInt();
            crustaceos = sc.nextInt();
            escolopendras = sc.nextInt();
            anillos = sc.nextInt();

            
            totalPatas = (insectos * 6) + (aracnidos * 8) + (crustaceos * 10) + (escolopendras * anillos * 2);

            
            System.out.println(totalPatas);
        }

    }
}
