/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.listasenlazadas;

/**
 *
 * @author dev
 */
public class ListasEnlazadas {

    class Nodo {

        int dato;
        Nodo siguiente;
    }

    private Nodo inicio = null;
    private Nodo fin = null;

    public void insertarInicio(int dato) {
        Nodo insertarNodo = new Nodo();
        insertarNodo.dato = dato;
        if (inicio == null && fin == null) {
            inicio = insertarNodo;
            fin = insertarNodo;
        } else {
            insertarNodo.siguiente = inicio;
            inicio = insertarNodo;
        }
    }

    public void insertarFinal(int dato) {
        Nodo insertarNodo = new Nodo();
        insertarNodo.dato = dato;
        if (inicio == null && fin == null) {
            inicio = insertarNodo;
            fin = insertarNodo;
        } else {
            fin.siguiente = insertarNodo;
            fin = insertarNodo;
        }
    }

    public int getDatoInicial() {
        return inicio.dato;
    }

    public int gatDatoFinal() {
        return fin.dato;
    }

    public int getLongitud() {
        int r = 0;
        if (inicio != null && fin != null) {
            Nodo n = inicio;
            while (n != null) {
                r++;
                n = n.siguiente;
            }
        }
        return r;
    }

    public String toString() {
        String r = "";
        if (inicio != null && fin != null) {
            Nodo n = inicio;
            while (n != null) {
                r = r + " " + n.dato;
                n = n.siguiente;
            }
        }

        return "{" + r.trim() + "}";
    }
}
