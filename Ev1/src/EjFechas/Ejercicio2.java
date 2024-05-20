/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjFechas;

import java.time.LocalDateTime;

/**
 *
 * @author dev
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        
        System.out.println("Que fecha era hace 15 días: " + LocalDateTime.now().minusDays(15));
        System.out.println("Que fecha era hace 30 días: " + LocalDateTime.now().minusMonths(1));
    }
}
