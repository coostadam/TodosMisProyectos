/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejerciciosData;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Exec {
    public static void main(String[] args) throws IOException {
        ArrayList<Persona> persons = setPerson();
        
        try (   FileOutputStream fos = new FileOutputStream("./persona.data");
                DataOutputStream dos = new DataOutputStream(fos);
                ){
            
            for (Persona person : persons) {
                dos.writeUTF(person.getCode());
                dos.writeUTF(person.getName());
                dos.writeUTF(person.getSurname());
                dos.writeDouble(person.getSalary());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
    }

    public static ArrayList<Persona> setPerson() {
        Scanner sc = new Scanner(System.in);    
        ArrayList<Persona> persons = new ArrayList<>();
        String code;
        String name;
        String surname;
        double salary;
        Persona p;
        do {
            System.out.print("Dame el código de la persona: ");
            code = sc.nextLine();
            if (!code.equalsIgnoreCase("Fin")) {
                System.out.print("Dame el nombre de la persona: ");
                name = sc.nextLine();
                System.out.print("Dame el apellido de la persona: ");
                surname = sc.nextLine();
                System.out.print("Dame el salario de la persona: ");
                salary = Double.parseDouble(sc.nextLine());
                p = new Persona(code, name, surname, salary);
                persons.add(p);
            }
        } while (!code.equalsIgnoreCase("Fin"));
        return persons;
    }
}
