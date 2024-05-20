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
public class DecompressFile {

    public static void main(String[] args) {
        int n;
        String[] r;
        try (FileInputStream fis = new FileInputStream("./rleCompress.data"); 
                DataInputStream dis = new DataInputStream(fis);) {

            while (dis.available() > 0) {
                r = String.valueOf(dis.readInt()).split(" ", 2);
                n = Integer.parseInt(r[0]);
                System.out.println(n);
                if (n != 1) {
                    n = Integer.parseInt(r[0]);
                    for (int i = 0; i < n; i++) {

                    }
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }
}
