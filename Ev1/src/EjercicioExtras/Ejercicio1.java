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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h, r, superficie, volumen;
        System.out.print("Dame la altura: ");
        h = sc.nextDouble();
        System.out.print("Dame el radio: ");
        r = sc.nextDouble();
        superficie = obtenerSuperficie(h, r);
        volumen = obtenerVolumen(h, r);
        System.out.println("La superficie es: " + superficie + " y el volumen es: " + volumen);
    }
    public static double obtenerSuperficie( double r, double h){
        double s = 0;
        
        s = Math.PI * Math.PI * r * h + Math.PI * Math.PI * r * r;

       return s;
    }
    public static double obtenerVolumen( double r, double h){
        double v = 0;
        
        v = Math.PI * r * r * h;

       return v;
    }
}
