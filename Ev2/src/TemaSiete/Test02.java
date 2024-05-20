/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

import static com.aulainformatica.utils.Utils.*;
import java.util.*;

/**
 *
 * @author dev
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> l = listaPrimos(37);
        for (Integer n : l) {
            System.out.println( n + " ");
        }
    }
}
