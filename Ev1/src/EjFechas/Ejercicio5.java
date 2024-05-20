/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjFechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author dev
 */
public class Ejercicio5 {
    public static void main(String[] args) {
         LocalDate myDateObj = LocalDate.now();
         LocalDate hoy = LocalDate.now();
         LocalDate finMes = LocalDate.of(2023, Month.NOVEMBER, 1);
         System.out.println("Para que acabe el mes quedan: " + ChronoUnit.DAYS.between(hoy, finMes));
         
    }
}
