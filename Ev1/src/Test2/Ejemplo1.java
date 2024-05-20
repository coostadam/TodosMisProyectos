/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Dame tu edad: ");
        a = Integer.parseInt(sc.nextLine());

        if (a >= 18) {
            System.out.println("Eres mayor de edad ");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
