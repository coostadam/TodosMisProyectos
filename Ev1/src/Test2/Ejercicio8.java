/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso;
        double imc, altura;
        System.out.print("Dime tu peso en kg: ");
        peso = sc.nextInt();
        System.out.print("Dime tu altura en metros: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc <= 17) {
            System.out.println("Infrapeso");
        } else if (imc > 17 && imc <= 18) {
            System.out.println("Peso bajo");
        } else if (imc > 18 && imc <= 25) {
            System.out.println("Peso saludable");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso grado 1");
        } else if (imc > 30 && imc <=35) {
            System.out.println("Sobrepeso grado 2");
        } else if (imc > 35 && imc <= 40){
            System.out.println("Sobrepeso grado 3");
        }else {
            System.out.println("Obesidad grado 4");
        }

    }
}
