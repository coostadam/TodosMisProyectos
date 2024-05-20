/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Test02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Dime un número entero: ");
        try {
            n = darUnNumero(sc);
        } catch(NumberFormatException e){
            System.out.println("Error en el formato de número.");
            
        }catch(IOException e){
            System.out.println("Error en entrada o salida.");
            
        }
    }
    
    
    public static int darUnNumero(Scanner sc) throws NumberFormatException, IOException{
        return Integer.parseInt(sc.nextLine());        
    }
}
