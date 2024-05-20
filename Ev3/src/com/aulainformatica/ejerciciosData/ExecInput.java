/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejerciciosData;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author dev
 */
public class ExecInput {
    public static void main(String[] args) throws IOException {
        ArrayList<Persona> persons = new ArrayList<>();
        String code;
        String name;
        String surname;
        double salary;
        Persona p;
        try (
                FileInputStream fis = new FileInputStream("./persona.data");
                DataInputStream dis = new DataInputStream(fis)
                ){
            while(dis.available() > 0){
                code = dis.readUTF();
                name = dis.readUTF();
                surname = dis.readUTF();
                salary = dis.readDouble();
                p = new Persona(code, name, surname, salary);
                persons.add(p);
            }
            
            for (Persona person : persons) {
                System.out.println(person);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
