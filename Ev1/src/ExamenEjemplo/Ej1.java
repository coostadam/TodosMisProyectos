/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenEjemplo;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txtUsu = "", txtSeparado = "";

        do {
            System.out.print("Dame una palabra: ");
            txtUsu = sc.nextLine();

            if (!txtUsu.equalsIgnoreCase("fin")) {
                txtSeparado = pasarMayusculas(txtUsu);
            }
        } while (!txtUsu.equalsIgnoreCase("fin"));
        System.out.println("Frase con más palabras cambiadas a mayúsculas:" + txtSeparado);
        System.out.println("Adios");
    }

    public static String pasarMayusculas(String txtUsu) {
        String[] separado = txtUsu.split(" ");
        String txtSeparados = "", txtMasLarga = "";
        int cont = 0;
        int max = 0;
        for (int i = 0; i < separado.length; i++) {
            cont = 0;
            if (separado[i].length() >= 5) {
                txtSeparados += " " + separado[i].toUpperCase();
                cont++;
            } else {
                txtSeparados += " " + separado[i];
            }
            
            
        }
        if (cont >  max) {
                txtMasLarga = txtSeparados;
                max = cont;
            }
        
        System.out.println(txtSeparados);

        return txtMasLarga;
    }
}
