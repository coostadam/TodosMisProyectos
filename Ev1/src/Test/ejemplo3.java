/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author dev
 */
public class ejemplo3 {
    public static void main(String[] args) {
        //operador de asignacion
        final int C = 10; //final = su valor no puede ser cambiado se le suele nombrar en mayus
        int a, b, r;
        double d; 
        a = 8;
        b = a;
        
        //operadores aritméticos
        
        a = 15;
        b = 7; 
        
        r = a + b; //suma
        r = a - b; //resta
        r = a * b; //multiplica 
        r = a / b; //division entera
        
        d = 1.0d * a / b; //divide con decimales
        System.out.println(d);
        
        r = a % b; //te devuelve el resto
        
        r++; //le suma 1 
        
        r--; //le resta 1 
        
        r += 2; //le suma 2 a r y se lo asigna 
        
        r -= 2; //le resta 2 a r y se lo asigna 
        
        
    }
}
