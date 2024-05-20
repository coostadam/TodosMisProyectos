/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author dev
 */
public class Ejercicio700 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<comparar> tiempo = new ArrayList<>();
        Map<String, Integer> tvSeries = new TreeMap<>();
        int nCases;
        String answer;
        String serie;
        String[] temp;
        int minView;
        do {
            nCases = Integer.parseInt(sc.nextLine());
            if (nCases != 0) {
                for (int i = 0; i < nCases; i++) {
                    answer = sc.nextLine();
                    temp = answer.split(" ", 2);
                    minView = Integer.parseInt(temp[0]);
                    serie = temp[1];
                    if (tvSeries.containsKey(serie)) {
                        tvSeries.put(serie, tvSeries.get(serie) + minView);
                    } else {
                        tvSeries.put(serie, minView);
                    }
                }
                for (String key : tvSeries.keySet()) {
                    comparar c = new comparar(key, tvSeries.get(key));
                    if (c.tiempo >= 30) {
                        tiempo.add(c);

                    }
                }
                orderSeries(tiempo);
            }
            tvSeries.clear();
            tiempo.clear();
        } while (nCases != 0);

    }

    public static void orderSeries(List<comparar> tiempo) {
        Collections.sort(tiempo);
        for (int i = 0; i < tiempo.size(); i++) {
            if (i != 3) {
                System.out.println(tiempo.get(i).nombre);
            } else {
                break;
            }
        }
        System.out.println("---");
    }

}

class comparar implements Comparable {

    String nombre;
    int tiempo;

    public comparar(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Object o) {
        comparar c = (comparar) o;
        if (this.tiempo != c.tiempo) {
            return c.tiempo - this.tiempo;
        } else {
            return this.nombre.compareTo(c.nombre);
        }
    }
}
