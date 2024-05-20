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
public class EjercicioExtraXV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor;

        System.out.print("Dame un dividendo: ");
        dividendo = sc.nextInt();
        System.out.print("Dame un divisor: ");
        divisor = sc.nextInt();

        dividirHasta(dividendo, divisor);

    }

    public static void dividirHasta(int dividendo, int divisor) {
        int cont = 0, resultado = 0;

        while (dividendo >= divisor) {
            resultado = dividendo / divisor;
            System.out.println(dividendo + " / " + divisor + " = " + resultado);
            cont++;
            dividendo = resultado;
        }
        System.out.println("El código se ejecuta " + cont + " veces.");

    }
}
