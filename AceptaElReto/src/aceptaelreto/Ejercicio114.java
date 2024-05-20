/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

    import java.util.Scanner;

    /**
     *
     * @author dev
     */
    public class Ejercicio114 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n, nUsu, ultDigito = 0;
            n = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n; i++) {
                nUsu = Integer.parseInt(sc.nextLine());
                if (nUsu == 0) {
                    ultDigito = 1;
                } else if (nUsu == 1) {
                    ultDigito = 1;

                } else if (nUsu == 2) {
                    ultDigito = 2;
                } else if (nUsu == 3) {
                    ultDigito = 6;
                } else if (nUsu == 4) {
                    ultDigito = 4;

                } else {
                    ultDigito = 0;
                }
                System.out.println(ultDigito);
            }
        }

    }
