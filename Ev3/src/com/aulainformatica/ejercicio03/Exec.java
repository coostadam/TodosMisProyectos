/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicio03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> aPerson = new ArrayList<>();
        FileWriter fw = null;
        File f = new File("./person.csv");
        String r;

        try {
            if (f.exists()) {
                System.out.print("¿Quieres sobreescribir los datos dentro del csv? -> ");
                r = sc.nextLine();
                if (r.equalsIgnoreCase("Si")) {
                    fw = new FileWriter(f, false);
                } else if (r.equalsIgnoreCase("No")) {
                    fw = new FileWriter(f, true);
                }
            } else {
                fw = new FileWriter(f);
            }
            setPerson(sc, aPerson);

            for (Persona persona : aPerson) {
                fw.write(persona.personToCSV() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error inesperado.");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    System.out.println("Ha ocurrido un error inesperado.");
                }
            }
        }
        sc.close();
    }

    public static void setPerson(Scanner sc, ArrayList<Persona> aPerson) {
        String name;
        String surname;
        String code;
        double salary;
        do {
            System.out.print("Código de la persona: ");
            code = sc.nextLine();
            if (!code.equals("FIN")) {
                System.out.print("Dame el nombre de la persona: ");
                name = sc.nextLine();
                System.out.print("Dime el apellido de la persona: ");
                surname = sc.nextLine();
                System.out.print("Dame el salario de la persona: ");
                salary = Double.parseDouble(sc.nextLine());
                aPerson.add(new Persona(code, name, surname, salary));
            }
        } while (!code.equals("FIN"));
    }
}
