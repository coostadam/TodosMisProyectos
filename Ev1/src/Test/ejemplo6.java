/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author dev
 */
public class ejemplo6 {
    public static void main(String[] args) {
        byte b = 9; 
        short s = 8;
        char c = 'a';
        int i = 99;
        long l = 124;
        float f = 12.5f; 
        double d = 14.888d;
        
        d = i; //no perdemos datos 
        i = b; //no perdemos datos
        b = (byte)l; //podemos perder datos, tenemos que poner (byte) o la variable que sea para que nos deje
        i = (int)d; // lo mismo de arriba, se llama cast
        
        //los tipos int y long pueden ser convertidos a double sin perder info
        
        
        System.out.println(" 3");
        
       
                
    }
}
