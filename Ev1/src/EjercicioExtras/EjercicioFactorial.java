/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtras;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class EjercicioFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Dame un número para hacer su factorial: ");
            n = sc.nextInt();
            if (n != 0){
                System.out.print(factorial(n));
            }
            System.out.println();
            
            
        } while (n != 0);
    }
    
    public static int factorial(int n){
        int r = 1;
        
        
        for (int i = 2; i <= n; i++) {
           r = r * i;
          
                  
            
        }
        return r;
        
    }
}
