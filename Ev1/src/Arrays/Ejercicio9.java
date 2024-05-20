/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] textoSeparado;
        String texto;
        System.out.print("Dame una frase separada por comas: ");
        texto = sc.nextLine();
        textoSeparado = texto.split(",");
        for (String string : textoSeparado) {
            System.out.println(string);
        }
    }
}
