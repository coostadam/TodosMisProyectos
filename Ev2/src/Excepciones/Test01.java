/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Test01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0, i;

        i = Integer.parseInt(sc.nextLine());
        try {
            r = 1 / i;
        } catch (ArithmeticException e) {
            System.out.println("A ocurrido una excepcion aritmetica");

        } catch (NumberFormatException error) {
            System.out.println("A habido un error con como has introducido los numeros");

        } catch (Exception e) {
            System.out.println("A ocurrido un error");

        } finally {
            System.out.println(r);
        }
    }
}
