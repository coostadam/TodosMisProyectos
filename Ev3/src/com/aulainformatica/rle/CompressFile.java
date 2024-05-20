/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.rle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dev
 */
public class CompressFile {

    public static void main(String[] args) {
        int cont = 0;
        int actN;
        int oldN = 0;
        try (FileInputStream fis = new FileInputStream("./rle.data"); 
                DataInputStream dis = new DataInputStream(fis); 
                FileOutputStream fos = new FileOutputStream("./rleCompress.data", false); 
                DataOutputStream dos = new DataOutputStream(fos);) {

            while (dis.available() > 0) {
                actN = dis.readInt();
                if (actN != oldN && cont != 0) {
                    dos.writeInt(cont);
                    dos.writeInt(oldN);
                    cont = 1;
                    oldN = actN;
                } else {
                    cont++;
                    oldN = actN;
                }
            }
            dos.writeInt(cont);
            dos.writeInt(oldN);
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }
}
