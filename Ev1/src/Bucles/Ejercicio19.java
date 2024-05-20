/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

/**
 *
 * @author dev
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        int n = 1000;
        boolean encontrado = false;
        while (n >= 1000 && n <= 2000) {
            if (n % 2 == 0 && n % 5 == 0 && n % 7777 == 0){
                encontrado = true; 
                break;
            }    
           n++;
        }
        if (encontrado == false){
            System.out.println("Ninguno");
        }else {
            System.out.println("El número es " + n);
        }
        
    }
}
