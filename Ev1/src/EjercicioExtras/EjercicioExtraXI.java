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
public class EjercicioExtraXI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = "", resultadoMax = "";
        int suma = 0, n = 0, max = Integer.MIN_VALUE;
        do {
            System.out.print("Dame una palabra con int entre las letras: ");
            txt = sc.nextLine();
            if (!txt.equalsIgnoreCase("fin")) {

                for (int i = 0; i < txt.length(); i++) {
                    if (Character.isDigit(txt.charAt(i))) {
                        n = Character.getNumericValue(txt.charAt(i));
                        suma += n;
                    }

                }
                if (max < suma) {
                    max = suma;
                    resultadoMax = txt;
                }
                System.out.println("La suma es: " + suma);
                suma = 0;
            }

        } while (!txt.equalsIgnoreCase("fin"));
        System.out.println("La máxima suma es: " + resultadoMax);
        System.out.println("----------------------------00");
        System.out.println("Adiósss!!!!!");
    }
}
