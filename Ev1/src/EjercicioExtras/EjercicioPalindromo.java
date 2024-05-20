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
public class EjercicioPalindromo {

    public static void main(String[] args) {

        comprobarPalindromo();

    }

    public static void comprobarPalindromo() {
        Scanner sc = new Scanner(System.in);
        boolean palindromo = false;
        String txtReverse = "", txtUsu = "";
        do {
            txtReverse = "";
            System.out.print("Dame una palabra para comprobar si es polindromo: ");
            txtUsu = sc.nextLine();
            String txtUsuTrim = txtUsu.toLowerCase().replace(" ", "");
            System.out.println(txtUsuTrim);
            if (!txtUsu.equalsIgnoreCase("fin")) {

                for (int i = 0; i < txtUsu.length(); i++) {
                   if (txtUsu.charAt(i) == 'á') {
                   }else if(txtUsu.charAt(i) == 'é'){
                  }else if (txtUsu.charAt(i) == 'í') {
                   }else if (txtUsu.charAt(i) == 'ó') {
                  }else if (txtUsu.charAt(i) == 'ú') {
                  }
                    txtReverse = txtUsu.charAt(i) + txtReverse;

                }
                
                txtReverse = txtReverse.replace(" ", "");
                System.out.println(txtReverse);
                if (txtReverse.equalsIgnoreCase(txtUsuTrim)) {
                    palindromo = true;
                } else {
                    palindromo = false;
                }

                if (palindromo) {
                    System.out.println("La palabra es palindromo");
                    System.out.println("La palabra al reves es: " + txtReverse);
                } else {
                    System.out.println("La palabra no es palindromo");
                    System.out.println("La palabra al reves es: " + txtReverse);
                }
            }
        } while (!txtUsu.equalsIgnoreCase("fin"));
        System.out.println("Adios!!!");
    }
}
