/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author dev
 */
public class ejemplo5 {
    public static void main(String[] args) {
        boolean a = true; 
        boolean b = false; 
        int i = 1;
        int j = 3;
        boolean c; 
        
        //solo valores numericos primitivos 
        c = a == b; //igual
        c = a != b; //distinto
        c = i < 8; //menor
        c = i <= j; //menor o igual
        c = i > 8; //mayor
        c = i >= 8; //mayor igual
        
        //comparadores logicos
        c = a == b && a == true; // && o & = and
        c = a == b || a == true; // || o | = or 
        c = !(a == true); //va a negar lo que pongamos todo va a ser false 
        System.out.println(c);
    }
}
