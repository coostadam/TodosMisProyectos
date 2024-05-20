/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class prueba2 {
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        int ladoUsuario;
        int area;
        System.out.print("Dame el número real al lado relativo de un cuadrado: ");
        ladoUsuario = pedir.nextInt(); 
        //System.out.println(ladoUsuario);
        
        area = ladoUsuario * ladoUsuario;    
        
        System.out.println("El área del cuadrado es: " + area);
        
    }
}
