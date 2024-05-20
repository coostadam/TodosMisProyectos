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
public class Test04 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> mapPositivo = new HashMap<>();
        
        map.put("A", -6);
        map.put("B", -6);
        map.put("C", 20);
        map.put("D", -15);
        map.put("Y", -8);
        
        System.out.println(map);
        
        for (String key : map.keySet()) {
            
            if (map.get(key) >= 0) {
                mapPositivo.put(key, map.get(key));
            }
        }
        
        System.out.println(mapPositivo);
    }
}
