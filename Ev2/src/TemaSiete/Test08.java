/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author dev
 */
public class Test08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca = "";
        List<Coche> coche = new ArrayList<>();
        Coche c1 = new Coche("Seat", "ibiza", LocalDate.of(2007, 10, 10), 12, 200);
        Coche c2 = new Coche("Mercedes", "Benz", LocalDate.of(2000, 10, 10), 12, 200);
        Coche c3 = new Coche("Ferrari", "LaFerrari", LocalDate.of(2020, 10, 10), 10, 200);
        coche.add(c3);
        coche.add(c2);
        coche.add(c1);
        do {
            System.out.println("Introduce los datos del coche.");
            System.out.print("Marca: ");
            marca = sc.nextLine();

            if (!marca.equalsIgnoreCase("Fin")) {
                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Fecha de fabricación: ");
                LocalDate fechaFab = LocalDate.parse(sc.nextLine());
                System.out.print("Litros de gasolina consumidos: ");
                double litros = Double.parseDouble(sc.nextLine());
                System.out.print("Kilometros recorridos con esos litros: ");
                double km = Double.parseDouble(sc.nextLine());
                Coche c = new Coche(marca, modelo, fechaFab, litros, km);
                coche.add(c);
            }

        } while (!marca.equalsIgnoreCase("Fin"));
        
        
        for (Coche coche1 : coche) {
            System.out.println(coche1);
        }
    }
}
