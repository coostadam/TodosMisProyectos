/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.rle;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class CreateFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp;
        int n;
        try(FileOutputStream fos = new FileOutputStream("./rle.data", true);
            DataOutputStream dos = new DataOutputStream(fos);){
            
            do {
                System.out.print("Escribe un número. (* para terminar) -> ");
                resp = sc.nextLine();
                if (!resp.equals("*")) {
                    n = Integer.parseInt(resp);
                    dos.writeInt(n);
                }
            } while (!resp.equals("*"));
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error.");
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }
}
