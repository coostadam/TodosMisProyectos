/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author dev
 */
public class Ejercicio624 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int nCasos, calcMesa = 0, maxMesa = 0;
        Set<String> calcetines = new HashSet<>();
        do {
            nCasos = Integer.parseInt(sc.nextLine());
            if (nCasos != 0) {
                String resp = sc.nextLine();
                String[] calcs = resp.split(" ");
                for (String calc : calcs) {
                    if (calcetines.contains(calc)) {
                        calcMesa--;
                        calcetines.remove(calc);
                    } else {
                        calcMesa++;
                        calcetines.add(calc);
                        if (calcMesa > maxMesa) {
                            maxMesa = calcMesa;
                        }
                    }
                }
                System.out.println(maxMesa);
            }
            calcMesa = 0;
            maxMesa = 0;
            calcetines.clear();
        } while (nCasos != 0);
    }
}
