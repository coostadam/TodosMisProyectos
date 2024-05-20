/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio366 {

    class ninio implements Comparable {

        int bueno, peso;

        public ninio(int bueno, int peso) {
            this.bueno = bueno;
            this.peso = peso;
        }

        @Override
        public String toString() {
            return bueno + " " + peso;
        }

        @Override
        public int compareTo(Object o) {
            ninio n = (ninio) o;
            if (this.bueno == n.bueno) {
                return this.peso - n.peso;
            } else {
                return n.bueno - this.bueno;
            }
        }
    }

    public static void main(String[] args) {
        (new Ejercicio366()).run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        ArrayList<ninio> al = new ArrayList<ninio>();
        int nNinyo, b, p;
        do {
            nNinyo = sc.nextInt();
            sc.nextLine();
            if (nNinyo != 0) {

                for (int i = 0; i < nNinyo; i++) {
                    b = sc.nextInt();
                    p = sc.nextInt();
                    sc.nextLine();
                    al.add(new ninio(b, p));
                }

                Collections.sort(al);

                for (ninio n : al) {
                    System.out.println(n.toString());
                }

                al.clear();
                System.out.println();
            }

        } while (nNinyo != 0);

    }

}
