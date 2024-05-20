/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

import java.util.*;

/**
 *
 * @author dev
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> nPositivos = new ArrayList<>();
        
        n.add(10);
        n.add(-4);
        n.add(-9);
        n.add(-9);
        n.add(-6);
        n.add(2);
        
        System.out.println(n);
        
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) >= 0) {
                nPositivos.add(n.get(i));
            }
        }
        
        System.out.println(nPositivos);
    }
}
