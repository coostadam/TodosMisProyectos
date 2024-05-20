/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.cifrado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class CifrarArchivo {

    private final static String words = "abcdefghijklmnopqrstuvwxyz";
    private final static String mayusWords = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String cifradorDeArchivos(int desp, String file) throws FileNotFoundException {
        String txt = "";
        String[] txtSep = null;
        String word = "";
        String codedPhrase = "";
        int pos = 0;
        char c;
        int o = 0;
        File f = new File(file);
        if (!f.exists()) {

        } else {
            try (Scanner scFile = new Scanner(new File(file))) {
                while (scFile.hasNextLine()) {
                    txtSep = scFile.nextLine().split(" ");
                }
                for (String text : txtSep) {
                    word = "";
                    for (int i = 0; i < text.length(); i++) {
                        if (o == 0) {
                            c = text.charAt(i);
                            for (int j = 0; j < mayusWords.length(); j++) {
                                if (mayusWords.charAt(j) == c) {
                                    pos = j;
                                    for (int k = 0; k < desp; k++) {
                                        pos++;
                                        if (pos == 26) {
                                            pos = 1;
                                        }
                                    }
                                    word = word + mayusWords.charAt(pos);
                                }
                            }
                        } else {
                            c = text.charAt(i);
                            for (int j = 0; j < words.length(); j++) {
                                if (words.charAt(j) == c) {
                                    pos = j;
                                    for (int k = 0; k < desp; k++) {
                                        pos++;
                                        if (pos == 26) {
                                            pos = 1;
                                        }
                                    }
                                    word = word + words.charAt(pos);
                                }
                            }
                        }

                    }
                    o++;
                    codedPhrase = codedPhrase + " " + word;
                }
            } catch (FileNotFoundException ex) {
                throw new FileNotFoundException();
            }
        }
        return codedPhrase;
    }
}
