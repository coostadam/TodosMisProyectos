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
public class Ejercicio8 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(1970,01,10);
        
        System.out.println("El cumpleaños a pasado " + cumple.isBefore(hoy));
        
    }
}
