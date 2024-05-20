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
public class Ejercicio428 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos, midiclorianos, contCuatro = 0;
        double valorBase = 0;
        String vBase;
        nCasos = sc.nextInt();
        for (int i = 0; i < nCasos; i++) {
            midiclorianos = sc.nextInt();
            int cociente = midiclorianos;
            String[] nums = new String[nCasos];
            for (int j = 0; j < 5; j++) {
                if (cociente >= 5) {
                    nums[j] = Integer.toString(cociente % 5);
                    cociente = cociente / 5;
                } else {
                    nums[j] = cociente + nums[j];
                }
                System.out.println(cociente);
                
            }
            
            vBase = String.valueOf(valorBase);
            for (int j = 0; j < vBase.length(); j++) {
                if (vBase.charAt(j) == '4') {
                    contCuatro++;
                }
            }
            if (contCuatro <= 1) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
            contCuatro = 0;
        }
    }
}
