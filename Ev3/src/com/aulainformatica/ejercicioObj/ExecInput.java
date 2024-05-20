/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicioObj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 *
 * @author dev
 */
public class ExecInput {

    public static void main(String[] args) {
        ArrayList<Persona> persons = new ArrayList<>();
        Persona p;

        try (FileInputStream fis = new FileInputStream("./person.obj"); 
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            do {
                p = (Persona) ois.readObject();
                persons.add(p);
            } while (true);
        } catch (EOFException ex) {
            System.out.println("Archivo leido al completo.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        for (Persona person : persons) {
            System.out.println(person.toString());
        }
    }
}
