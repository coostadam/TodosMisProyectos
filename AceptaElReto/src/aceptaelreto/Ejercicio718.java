/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dev
 */
public class Ejercicio718 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> joyas = new TreeSet<>();
        int nJoyas, cont = 0;
        String tipoJoya;
        do {
            nJoyas = sc.nextInt();
            if (nJoyas != 0) {
                for (int i = 0; i < nJoyas; i++) {
                    tipoJoya = sc.next();
                    cont += tratarCaso(joyas, tipoJoya);
                }
                System.out.println(cont);
            }
            joyas.clear();
            cont = 0;
        } while (nJoyas != 0);
    }

    public static int tratarCaso(Set<String> joyas, String tipoJoya) {
        int cont = 0;
        if (joyas.contains(tipoJoya)) {
            cont++;
            joyas.remove(tipoJoya);
        }else{
            joyas.add(tipoJoya);
        }
        return cont;
    }
}
