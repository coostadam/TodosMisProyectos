/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjFechas;

import java.time.LocalDate;

/**
 *
 * @author dev
 */
public class Ejercicio7 {
    public static void main(String[] args) {
         LocalDate myDateObj = LocalDate.now();
        
        System.out.println("He vivido: " + LocalDate.of(2005, 05, 15).lengthOfMonth());
    }
}
