/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejercicio03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class ExecLeerCSV {
    public static void main(String[] args) {
        ArrayList<Persona> aPerson = new ArrayList<>();
        Persona p;
        String[] datos;
        try(Scanner scFile = new Scanner(new File("./person.csv"));){
            while(scFile.hasNextLine()){
                datos = scFile.nextLine().split(",");
                p = new Persona(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]));
                aPerson.add(p);
            }
            for (Persona persona : aPerson) {
                System.out.println(persona);
            }
        }catch(Exception e){
            System.out.println("Error.");
        }
    }
}
