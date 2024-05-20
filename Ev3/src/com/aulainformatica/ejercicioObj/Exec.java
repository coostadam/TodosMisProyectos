/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioObj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) {
        ArrayList<Persona> persons = setPerson();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = new File("./person.obj");
        try {
               if (!f.exists()) {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
               }else{
                fos = new FileOutputStream(f, true);
                oos = new MyObjectOutputStream(fos);
               }
        } catch (IOException e) {
            System.out.println(e);
        }finally{
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
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
