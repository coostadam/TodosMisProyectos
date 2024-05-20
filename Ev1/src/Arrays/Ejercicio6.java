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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] aDouble = new double[20];

        System.out.print("Dame un número double: ");
        aDouble[0] = sc.nextDouble();

        for (int i = 1; i < aDouble.length; i++) {
            aDouble[i] = aDouble[i - 1] / 2;
            System.out.println(aDouble[i]);
        }
    }
}
