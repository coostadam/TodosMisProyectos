/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mCableA = 0, mCableB = 0, precioCableA, precioCableB, precioTotal;
        String nombreCliente = "";
        
        System.out.print("Cuantos metros de cable A quieres: ");
        mCableA = sc.nextDouble();
        System.out.print("Cuantos metros de cable B quieres: ");
        mCableB = sc.nextDouble();
        System.out.print("Dime tu nombre: ");
        nombreCliente = sc.nextLine();
        precioCableA = mCableA * 2.75;
        precioCableB = mCableB * 3.5;
        
       if (mCableA + mCableB >= 100){
            precioTotal = precioCableA + precioCableB * 0.9;
        }
        
        
        
        
        
    }
}
