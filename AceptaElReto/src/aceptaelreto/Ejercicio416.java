/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.*;

/**
 *
 * @author dev
 */
public class Ejercicio416 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet cumpleanyos = new HashSet<>();
        int personas;
        boolean mismoCumple = false;

        do {
            personas = sc.nextInt();
            if (personas != 0) {
                for (int i = 0; i < personas; i++) {
                    String fecha = sc.next();
                    String[] cumples = fecha.split("/");
                    String cumple = cumples[0] + "/" + cumples[1];
                    if (cumpleanyos.contains(cumple)) {
                        mismoCumple = true;
                    } else {
                        cumpleanyos.add(cumple);
                    }
                }
                if (mismoCumple) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
                mismoCumple = false;
                cumpleanyos.clear();
            }
        } while (personas != 0);
    }
}
