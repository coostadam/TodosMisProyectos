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
public class EjercicioExtraXIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, inicio;
        System.out.print("Dame el numero de veces que quieres que se repita la accion: ");
        n = sc.nextInt();
        System.out.print("Por cual numero quieres empezar: ");
        inicio = sc.nextInt();
        delvolverResultado(n, inicio);
        
    }
    public static int[] delvolverResultado ( int n, int inicio){
        int[] num = new int[n];
        int mult = 1;

        for (int i = 0; i < n; i++) {
            num[i] = inicio * mult;
            System.out.println(mult + " x " + inicio + " = " + num[i]);
            mult++;
        }
        return num;
    }
}
