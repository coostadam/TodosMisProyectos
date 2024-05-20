/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtras;

/**
 *
 * @author dev
 */
public class Ejercicio {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int t = 4; t >= 0; t--) {
            for (int j = 1; j <= t; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
    }


