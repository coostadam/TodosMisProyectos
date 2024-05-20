package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class ejemplo4 {
    public static void main(String[] args) {
        String a = "pepe";
        String b = "Juan";
        String c;
        
        //contatenamos
        
        c = a + b;
        c = a.concat(b); 
        
        //fin contatenacion
        
        int s = 8; 
        int t = 5; 
        
        //concatenar string y value
        
        c = c + s; 
        
        c = "" + s; //string que sea un numero
        
        c = "" + (s + t); //suma en concatenacion
        
    }
}
