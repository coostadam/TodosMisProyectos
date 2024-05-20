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
public class EjercicioExtraX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String[] text;
        System.out.print("¿Cuántas cadenas de texto vas a introducir? ");
        n = sc.nextInt();
        text = new String[n];
        sc.nextLine();
        for (int i = 0; i < text.length; i++) {
            System.out.print("Dame la frase de la posición " + i + " ");
            text[i] = sc.nextLine();
        }
        System.out.println("La cadena de texto con más vocales es: " + cadenaMasVocales(text));
        System.out.println("La cadena de menos con más vocales es: " + cadenaMenosVocales(text));
        System.out.println("La cadena más corta es: " + masCorta(text));
        System.out.println("La cadena más larga es: " + masLarga(text));
    }

    public static String cadenaMasVocales(String[] text) {
        String resultado = "";
        int cont[] = new int[text.length];
        int mayorVocal = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                if (text[i].charAt(j) == 'a' || text[i].charAt(j) == 'e'
                        || text[i].charAt(j) == 'o' || text[i].charAt(j) == 'u'
                        || text[i].charAt(j) == 'i') {

                    cont[i]++;
                }
            }

        }
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] >= mayorVocal) {
                resultado = text[i];
                mayorVocal = cont[i];
            }
        }
        return resultado;
    }

    public static String cadenaMenosVocales(String[] text) {
        String resu = "";
        int cont[] = new int[text.length];
        int menosVocal = 1000000000;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                if (text[i].charAt(j) == 'a' || text[i].charAt(j) == 'e'
                        || text[i].charAt(j) == 'o' || text[i].charAt(j) == 'u'
                        || text[i].charAt(j) == 'i') {

                    cont[i]++;
                }
            }
        }
        for (int h = 0; h < cont.length; h++) {
            if (cont[h] <= menosVocal) {
                resu = text[h];
                menosVocal = cont[h];
            }
        }
        return resu;
    }

    public static String masCorta(String[] text) {
        String r = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < text.length; i++) {

            if (min > text[i].length()) {
                r = text[i];
                min = text[i].length();
            }
        }

        return r;

    }

    public static String masLarga(String[] text) {
        String re = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < text.length; i++) {
            if (max < text[i].length()) {
                re = text[i];
                max = text[i].length();
            }
        }
        return re;
    }
    
}
