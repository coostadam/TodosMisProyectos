/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String personaje, parentesco;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            personaje = sc.nextLine();
            parentesco = sc.nextLine();
            
            if (personaje.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            }else{
                System.out.println(personaje + ", yo soy tu " + parentesco);
            }

        }

    }
}
