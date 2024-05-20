/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author dev
 */
public class ejemplo7 {
    public static void main(String[] args) {
        String str;
        
        int n = 5; 
        
        str = "" + n; //manera "pirata"
        
        //wrapper class 
        
        byte b = 9; //Byte
        short s = 8; //Short
        char c = 'a'; //Character
        int i = 99; //Integer
        long l = 124; //Long
        float f = 12.5f; //Float
        double d = 14.888d; //Double
        
        str = Integer.toString(i); //lo cambiamos a int
        str = Long.toString(l); //lo cambio a double
        
        
        str = "14";
        i = Integer.parseInt(str);
      
        
        i = Character.getNumericValue(c); //coge el valor numerico en un char
        
        
    }
}
