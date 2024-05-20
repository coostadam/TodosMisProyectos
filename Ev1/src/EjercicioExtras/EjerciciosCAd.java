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
public class EjerciciosCAd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n, texto;
        do {
            System.out.print("Número: ");
            n = sc.next();
            texto = sc.next();
            if (!n.equalsIgnoreCase("0")) {
                texto = texto.replaceAll(n, "");
            }
            if(texto.equalsIgnoreCase("")){
                texto = "0";
            }
            System.out.println(texto);
        } while (!n.equalsIgnoreCase("0"));
        System.out.println("Adiós!!!");
    }
}
