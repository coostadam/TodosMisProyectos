/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.utils;

import java.util.*;

/**
 *
 * @author dev
 */
public class Utils {

    public static boolean esPrimo(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List listaPrimos(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i) == true) {
                l.add(i);
            }
        }
        return l;
    }

    public static List fibonacci(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
         for (int i = 2; i < n; i++) {
            l.add(l.get(i - 1) + l.get(i - 2));
        }
        return l;
    }
     public static int aleatorio(int min ,int max){
        return (int)(Math.random() * (max - min + 1 ) + min);
         
    }
}
