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
public class Prueba1 {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un valor a A: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Pon un valor a B: ");
        b = Integer.parseInt(sc.nextLine());
        if (a < b) {
            System.out.println("A es menor que B");
        } else if (a == b) {
            System.out.println("Son iguales");
        } else {
            System.out.println("B es menor que A");
        }

        System.out.println("---------------------------");
        System.out.print("Dame un string: ");
        String str1 = sc.nextLine();
        System.out.print("Dame otro string: ");
        String str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2) && (a + b == 100)) {
            System.out.println("Son dos palabras iguales");
            System.out.println("La suma de A y B es 100");
        } else if (str1.length() == str2.length()) {
            System.out.println("No son iguales pero si son igual de largos");
        } else {
            System.out.println("No cumple ninguna condicion");

        }
    }
}
