/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjFechas;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author dev
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();

        System.out.println("Que fecha será en 15 días:" + LocalDate.now().plusDays(15));
        System.out.println("Que fecha será en 30 días:" + LocalDate.now().plusMonths(1));
        System.out.println("Que fecha será en 45 días:" + LocalDate.now().plusMonths(1).plusDays(15));

    }
}
