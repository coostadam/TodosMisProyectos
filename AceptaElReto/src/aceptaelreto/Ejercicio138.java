/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio138 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int n, nUsu, factorial = 1, ultNum = 0;
        String ultNumS = "";
        n = Integer.parseInt(sc.nextLine());
        array = new int[n];
        for (int i = 0; i < n; i++) {
            nUsu = Integer.parseInt(sc.nextLine());
            array[i] = 1;
            for (int j = 1; j <= nUsu; j++) {
                array[i] = array[i] * j;
                ultNum = array[i];
                System.out.println(array[i]);
            }
            ultNumS = String.valueOf(ultNum);
            for (int j = 0; j < ultNumS.length(); j++) {
//                if (ultNumS.charAt(j).equals("0")) {
//                    
//                }
            }
        }
    }
}
