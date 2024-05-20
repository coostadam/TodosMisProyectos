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
public class Prueba6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int segIni, resto, horas, min, segundos; 
        
        System.out.print("Dame los segundos: ");
        segIni = Integer.parseInt(sc.nextLine()); 
        
        horas = segIni / 3600;
        
        resto = segIni % 3600; 
        
        min = resto / 60; 
        
        segundos = resto % 60; 
        
        System.out.printf("Las horas son %d, los minutos %d, y los segundos %d \n", horas, min, segundos);
        
    }
}
