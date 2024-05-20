/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.rle;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author dev
 */
public class ReadFile {

    public static void main(String[] args) {
        int solucionInt;
        try (FileInputStream fis = new FileInputStream("./rleCompress.data"); 
                DataInputStream dis = new DataInputStream(fis);) {

            while (dis.available() > 0) {
                solucionInt = dis.readInt();
                System.out.println(solucionInt);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }
}
