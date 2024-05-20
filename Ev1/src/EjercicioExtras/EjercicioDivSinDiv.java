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
public class EjercicioDivSinDiv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor, cociente;
        System.out.print("Dame un dividendo: ");
        dividendo = sc.nextInt();
        System.out.print("Dame un divisor: ");
        divisor = sc.nextInt();
        cociente = divisionEntera(dividendo, divisor);
        System.out.println("La división entera es: " + cociente);
        System.out.println("El resto de la division es: " + restoDivisionEntera(dividendo, divisor, cociente));
    }

    public static int divisionEntera(int dividendo, int divisor) {
        int resultado = 0;

        do {
            if (dividendo > 0) {
                dividendo -= divisor;
                resultado++;
            }

        } while (dividendo > 0);

        resultado--;

        return resultado;
    }

    public static int restoDivisionEntera(int dividendo, int divisor, int cociente) {
        return dividendo - (divisor * cociente);
    }
}
