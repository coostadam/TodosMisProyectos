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
public class Prueba13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txtUsu;
       

        System.out.print("Dame un texto: ");
        txtUsu = sc.nextLine();
    
        System.out.println(txtUsu.charAt(txtUsu.length() -1));

    }
}
