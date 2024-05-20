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
public class Ejercicio6 {
    public static void main(String[] args) {
        LocalDate myDateObj = LocalDate.now();
        
        System.out.println("Dentro de 200 días será el mes: " + LocalDate.now().plusDays(200).getMonth());
    }
}
