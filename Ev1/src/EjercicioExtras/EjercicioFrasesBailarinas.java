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
public class EjercicioFrasesBailarinas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "", resultado = "";
        do {
            System.out.print("Introduce texto: ");
            text = sc.nextLine();
            if (!(text.equalsIgnoreCase("fin"))) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) != ' ') {
                       
                    
                    if (i % 2 == 0) {
                        resultado = resultado + Character.toUpperCase(text.charAt(i));
                    } else {
                        resultado = resultado + Character.toLowerCase(text.charAt(i));
                    }
                    }
                }
            }
            System.out.println(resultado);
            resultado = "";
        } while (!(text.equalsIgnoreCase("fin")));
        System.out.println("Adiós!!!");
    }
}
