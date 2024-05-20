/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

/**
 *
 * @author dev
 */
public class Orientaciones implements Comparable {
    String nombre;
    int numero;
    double numeroComa;
    
    @Override
    public int compareTo(Object o) {
        Orientaciones oc = (Orientaciones)o;
       // return this.numero - oc.numero; //ascendente 
       // return oc.numero - this.numero; //descencente
       
       // return this.nombre.compareTo(oc.nombre); //ascendente 
       // return oc.nombre.compareTo(this.nombre); //descendente 
       
       // Con doubles usamos las wrapper class
       
       Double thisNumeroC = this.numeroComa;
       Double otroNumeroC = oc.numeroComa;
       
       // return thisNumeroC.compareTo(otroNumeroC); //ascendente 
       // return otroNumeroC.compareTo(thisNumeroC); //descendente 
       
       // Ordenar por número y si tienen el mismo número ordenadar por nombre de manera alfabetica
       
        if (this.numero == oc.numero) {
            return this.nombre.compareTo(oc.nombre);
        }else{
             return this.numero - oc.numero; 
        }
       
    }
    
}
