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
public class Test01 {

    public static void main(String[] args) {
        Map<String, Integer> ciudad;
        
        ciudad = new TreeMap<>();
        
        ciudad.put("Madrid", 300);
        ciudad.put("Barcelona", 200);
        ciudad.put("Alcantud", 1);

        System.out.println("Alcantud tiene " + ciudad.get("Halkantud" + " habitantes"));

        if (ciudad.containsKey("Alcantud")) {
            System.out.println("Alcantud esta entre la lista");
        } else {
            System.out.println("No esta entre la lista");
        }

        System.out.println("Las ciudades que están son: " + ciudad);    
        
        ciudad.remove("Alcantud");
        
        if (ciudad.containsKey("Alcantud")) {
            System.out.println("Alcantud esta entre la lista");
        } else {
            System.out.println("No esta entre la lista");
        }
        
        
    }
}
