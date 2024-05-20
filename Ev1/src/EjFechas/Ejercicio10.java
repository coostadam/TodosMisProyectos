/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjFechas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate[] fechaNacimiento;
        int mes, dia, anyo;
        String[] nombre;
        int n;
        System.out.print("¿Cúantos trabajadores tiene la empresa? ");
        n = sc.nextInt();
        fechaNacimiento = new LocalDate[n];
        nombre = new String[n];
        sc.nextLine();
        for (int i = 0; i < nombre.length; i++) {
            System.out.print("¿Cúal es el nombre del trabajador " + i + "? ");
            nombre[i] = sc.nextLine();
        }
        for (int i = 0; i < fechaNacimiento.length; i++) {
            System.out.print("¿Cúal es el año de nacimiento del trabajador llamado: " + nombre[i] + " ? ");
            anyo = sc.nextInt();
            System.out.print("¿Cúal es el mes de nacimiento del trabajador llamado: " + nombre[i] + " ? ");
            mes = sc.nextInt();
            System.out.print("¿Cúal es el día en el que nació el trabajador llamado: " + nombre[i] + " ? ");
            dia = sc.nextInt();
            fechaNacimiento[i] = LocalDate.of(anyo, mes, dia);
        }

        int pos = posicionDelSecretario(fechaNacimiento);

        System.out.println("El menor es: " + nombre[pos]);
        System.out.println("Su fecha de nacimiento es: " + fechaNacimiento[pos]);

    }

    public static int posicionDelSecretario(LocalDate[] fechasNacimiento) {
        int r = 0;
        LocalDate menor = fechasNacimiento[0];

        for (int i = 0; i < fechasNacimiento.length; i++) {
            if (fechasNacimiento[i].isAfter(menor)) {
                r = i;
                menor = fechasNacimiento[i];
            }
        }
        return r;
    }
}
