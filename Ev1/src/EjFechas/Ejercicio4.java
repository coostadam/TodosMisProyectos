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
public class Ejercicio4 {

    public static void main(String[] args) {
        LocalDate myDateObj = LocalDate.now();
        LocalDate hoy = LocalDate.now();
        LocalDate finCurso = LocalDate.of(2024,06,26);

        System.out.println("Para que finalice el curso queda: " + ChronoUnit.DAYS.between(hoy, finCurso));
    }
}
