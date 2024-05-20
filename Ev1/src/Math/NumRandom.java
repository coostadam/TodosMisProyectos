/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Math;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class NumRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min, num;
        String seguir = "";
        do {
            System.out.print("Introduce un numero minimo: ");
            min = sc.nextInt();
            sc.nextLine();
            System.out.print("Introduce un numero máximo: ");
            max = sc.nextInt();
            sc.nextLine();
            num = aleatorio(min, max);
            System.out.println(num);
            System.out.print("¿Quieres otro número?(S/N)");
            seguir = sc.nextLine();
            
            
        } while (!seguir.equalsIgnoreCase("n"));
    }
    public static int aleatorio(int min ,int max){
        return (int)(Math.random() * (max - min + 1 ) + min);
         
    }
}
