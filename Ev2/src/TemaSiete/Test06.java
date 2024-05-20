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
public class Test06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = "";
        Set<Empleado> e = new HashSet<>();
        do {
            System.out.println("---------MENÚ---------");
            System.out.println("1 - Insertar datos de empledo.");
            System.out.println("2 - Listar todos los empleados.");
            System.out.println("3 - Mostrar números de empleados.");
            System.out.println("4 - Salir.");
            System.out.print("Elecciona tu respuesta: ");
            resp = sc.nextLine();

            if (!resp.equalsIgnoreCase("4")) {
                if (resp.equalsIgnoreCase("1")) {
                    introducirDatos(e, sc);
                } else if (resp.equalsIgnoreCase("2")) {
                    mostrarDatos(e);
                } else if (resp.equalsIgnoreCase("3")) {
                    numeroEmpleados(e);
                }
            }
        } while (!resp.equalsIgnoreCase("4"));

    }

    public static void introducirDatos(Set<Empleado> e, Scanner sc) {
        System.out.println("--------Introducir datos--------");
        System.out.println("¿Que tipo de empleado deseas añadir?");
        System.out.println("1 - Para técnico.");
        System.out.println("2 - Para comercial.");
        System.out.print("Cual quieres: ");
        String r = sc.nextLine();

        System.out.print("Código: ");
        int cod = Integer.parseInt(sc.nextLine());
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Fecha de nacimiento (YYYY-MM-DD) : ");
        LocalDate fechaNac = LocalDate.parse(sc.nextLine());

        if (r.equalsIgnoreCase("1")) {
            System.out.print("Especialidad: ");
            String esp = sc.nextLine();
            Técnico t = new Técnico(esp, cod, nombre, apellido, fechaNac);
            e.add(t);
        } else {
            System.out.print("Zona: ");
            String zona = sc.nextLine();
            Comercial c = new Comercial(zona, cod, nombre, apellido, fechaNac);
            e.add(c);
        }
    }
    public static void mostrarDatos(Set<Empleado> e) {
        System.out.println("--------Mostrar datos--------");
        for (Empleado empleado : e) {
            System.out.println(empleado);
        }
    }

    public static void numeroEmpleados(Set<Empleado> e) {
        System.out.println("En total hay " + e.size() + " empleados");
    }
}
