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
public class Ejercicio3 {
    public static void main(String[] args) {
                LocalDate myDateObj = LocalDate.now();
                
        System.out.println("Que dia de la semana nació Donald: " + LocalDate.of(1938, 01, 10).getDayOfWeek());

    }
   
}
