/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen2ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clase, candidato;
        int puntos;
        Map<String, Integer> participantes = new HashMap<>();
        
        do {
            System.out.print("Identificador de clase: ");
            clase = sc.nextLine();
            if (!clase.equals("FIN")) {
                do {
                    System.out.print("Nombre del candidato: ");
                    candidato = sc.nextLine();
                    if (!candidato.equals("FIN")) {
                        System.out.print("Número de votos: ");
                        puntos = Integer.parseInt(sc.nextLine());
                        setParticipantes(participantes, candidato, puntos);
                    }
                } while (!candidato.equals("FIN"));
            }
        } while (!clase.equals("FIN"));
        mostrarOutPut(participantes);
    }

    public static void setParticipantes(Map<String, Integer> participantes, String candidato, int puntos) {
        if (participantes.containsKey(candidato)) {
            participantes.put(candidato, participantes.get(candidato) + puntos);
        }else{
            participantes.put(candidato, puntos);
        }
    }

    public static void mostrarOutPut(Map<String, Integer> participantes) {
        ArrayList<OrderParticipantes> orderPar = new ArrayList<>();
        
        for (String key : participantes.keySet()) {
            OrderParticipantes o = new OrderParticipantes(key, participantes.get(key));
            orderPar.add(o);
        }
        
        Collections.sort(orderPar);
        System.out.println("------------------------------------------------");
        System.out.println("SALIDA");
        for (int i = 0; i < orderPar.size() ; i++) {
            System.out.println(orderPar.get(i).toString() + " votos");
        }
    }
}

class OrderParticipantes implements Comparable{
    String nombre;
    int puntos;

    public OrderParticipantes(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return  nombre + " " + puntos ;
    }
   
    @Override
    public int compareTo(Object o) {
        OrderParticipantes oP = (OrderParticipantes)o;
        return  oP.puntos - this.puntos;
    }
}