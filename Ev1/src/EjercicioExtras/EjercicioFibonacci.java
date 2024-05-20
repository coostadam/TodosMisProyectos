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
public class EjercicioFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1 = 1, n2 = 1, n3;
        do {
            System.out.print("Dame un número para hacer la secuencia de fibonacci: ");
            n = sc.nextInt();
            
            if (n >= 2){
                for (int i = 1; i <= n; i++) {
              
                    n3 = n2 + n1;
                    System.out.print("1 1  " + n3);
                    n1 = n2;
                    n2 = n3;     
                }
               System.out.println();
            }
            
        } while (n >= 2);
    }
}
