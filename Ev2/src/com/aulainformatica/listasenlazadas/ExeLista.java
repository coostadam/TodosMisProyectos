/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.listasenlazadas;

/**
 *
 * @author dev
 */
public class ExeLista {
    public static void main(String[] args) {
        ListasEnlazadas lista = new ListasEnlazadas();
        lista.insertarInicio(5);
        lista.insertarInicio(9);
        lista.insertarFinal(4);
        lista.insertarFinal(3);
        System.out.println(lista);
        System.out.println("Tiene una longitud de: " + lista.getLongitud());
    }
}
