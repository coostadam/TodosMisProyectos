package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dev
 */
public class ejemplo8 {
    public static void main(String[] args) {
        int i;
        int a = 10;
        int b = 6;
        int p1 = 2;
        int p2 = 3;
        String pr;
        i = suma(a, b);
        System.out.println(i);
        
        //pr = concat(p1, p2);
        //System.out.println(pr);
        
        
    }
    public static int suma(int a, int b) {
        int r;
        r = a + b;
        return r;
        
    }
    public static String concat() {
        String s;
        int p1 = 1;
        int p2 = 2;
       
        s = "" + p1 + p2;
        return s;
    }
    
}
