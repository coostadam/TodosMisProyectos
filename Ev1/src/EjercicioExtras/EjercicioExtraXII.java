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
public class EjercicioExtraXII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Dame un número para hacer una lista de narcisista: ");
            n = sc.nextInt();
            if (n != 0) {

                esNarcisista(n);
            }

        } while (n != 0);
    }

    public static boolean esNarcisista(int n) {
        String str = Integer.toString(n);
        int nCifras = Integer.toString(n).length();
        int suma = 0, cifra;
        int[] r = new int[n];
        int[] narci = new int[n];
        for (int i = 0; i < n; i++) {
            r[i]++;
        }
        for (int i = 0; i < n; i++) {
           //r = Character.getNumericValue(str.charAt(i));
        }
        return false;
    }
}
