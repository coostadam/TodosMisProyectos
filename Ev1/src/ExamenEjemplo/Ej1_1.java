package ExamenEjemplo;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class Ej1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String txt, txtMasCambio = "";
        
        do {
            System.out.print("Introduce una cadena de texto: ");
            txt = sc.nextLine();
            if (!txt.equalsIgnoreCase("fin")) {
                System.out.println("Salida: " + pasarMayus(txt));
                txtMasCambio = masCambio(txt, max);
            }
        } while (!txt.equalsIgnoreCase("fin"));
        System.out.println("Frase con más palabras cambiadas a mayúsculas: " + txtMasCambio);
        System.out.println("Adiós!!!");
    }

    public static String pasarMayus(String texto) {
        String textoMayus = "";
        String[] textoSeparado = texto.split(" ");
        for (int i = 0; i < textoSeparado.length; i++) {
            if (textoSeparado[i].length() >= 5) {
                textoMayus = textoMayus + " " + textoSeparado[i].toUpperCase();
            } else {
                textoMayus = textoMayus + " " + textoSeparado[i];
            }
        }
        return textoMayus;
    }

    public static String masCambio(String texto, int max) {
        int cont = 0;
        String textoMasMayus = "";
        String textoMayus = "";
        String[] textoSeparado = texto.split(" ");
        for (int i = 0; i < textoSeparado.length; i++) {
            if (textoSeparado[i].length() >= 5) {
                textoMayus = textoMayus + " " + textoSeparado[i].toUpperCase();
                cont++;
            } else {
                textoMayus = textoMayus + " " + textoSeparado[i];
            }

        }
       
        if (cont > max) {
            textoMasMayus = textoMayus;
            max = cont;
        }
        
        cont = 0;
        return textoMasMayus;
    }
}
