/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtras;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class EjercicioXIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txtUsu = "";
        do {
            System.out.print("Cuántos carácteres deseas eliminar: ");
            txtUsu = sc.nextLine();
            if (!txtUsu.equalsIgnoreCase("fin")) {
                int n = Integer.parseInt(txtUsu);
                eliminarCaracteres(n, sc);
            }
            
        } while (!txtUsu.equalsIgnoreCase("fin"));
        System.out.println("Adioss!!!");
    }
    public static void eliminarCaracteres(int n, Scanner sc){
        String txt = "";
        char[] caracter = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Que caracter deseas eliminar: ");
            caracter[i] = sc.nextLine().charAt(0);
        }
       
            System.out.print("Dame la frase: ");
            txt = sc.nextLine();
            
          for (int j = 0; j < n; j++) {
            txt = txt.replaceAll(Character.toString(caracter[j]), "");
            
        }
          System.out.println(txt);
        
    }
}
