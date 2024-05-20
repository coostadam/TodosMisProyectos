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
public class Ejercicio112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double velocidadKmH, distancia, veloMax, segTardado;
        String respuesta;
        do {
            
            distancia = sc.nextDouble();
            
            veloMax = sc.nextDouble();
          
            segTardado = sc.nextDouble();
            
            if (distancia < 0 || veloMax < 0 || segTardado < 0) {
                System.out.println("ERROR");
            }
            if (distancia != 0 && veloMax != 0 && segTardado != 0) {
                velocidadKmH = calcularVelocidad(distancia, segTardado);
                respuesta = validarVelocidad(veloMax, velocidadKmH);
            }
        } while (distancia != 0 && veloMax != 0 && segTardado != 0);
    }

    static double calcularVelocidad(double distancia, double segTardado) {
        double velocidad, velocidadKmH;
        velocidad = distancia / segTardado;
        velocidadKmH = velocidad * 3.6d;
        return velocidadKmH;
    }

    static String validarVelocidad(double veloMax, double velocidadKmH) {
        String resp = "";
      
        if (velocidadKmH <= veloMax) {
            System.out.println("OK");
        } else if (velocidadKmH > veloMax * 1.2d) {
            System.out.println("PUNTOS");
        } else {
            System.out.println("MULTA");
        }
       
        return resp;
    }
}
