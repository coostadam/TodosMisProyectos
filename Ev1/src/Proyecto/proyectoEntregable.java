/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dev
 */
//Proyecto realizado por Alejandro Costa y Javier Eugenio Cotillas.
public class proyectoEntregable {

    public static void main(String[] args) {
        menuInicio();
    }

    public static void menuInicio() {
        Scanner sc = new Scanner(System.in);
        String respuestaUsuario;
        do {
            System.out.println("Introduce un 1 si quieres que la máquina adivine el número.");
            System.out.println("introduce un 2 si quieres ser tu quien adivine el número.");
            System.out.print("¿Que modo quieres jugar? ");
            respuestaUsuario = sc.nextLine();
            if (respuestaUsuario.equals("1") || respuestaUsuario.equals("2")) {
                if (respuestaUsuario.equals("1")) {
                    juegaMaquina();
                }
                if (respuestaUsuario.equals("2")) {
                    juegoUsuario();
                }
            } else {
                System.out.println("Introducelo de nuevo");
            }

        } while (!(respuestaUsuario.equals("1") || respuestaUsuario.equals("2")));
    }

    public static void seguirJugando() {
        Scanner sc = new Scanner(System.in);

        String seguir = "";
        do {

            System.out.print("¿Quieres seguir jugando? (SI o NO) ");
            seguir = sc.nextLine();

            if (!(seguir.equalsIgnoreCase("si") || seguir.equalsIgnoreCase("no"))) {
                System.out.println("Pon si o no");
            }

        } while (!(seguir.equalsIgnoreCase("si") || seguir.equalsIgnoreCase("no")));

        if (seguir.equalsIgnoreCase("SI")) {
            menuInicio();
        } else {
            System.out.println("Adiós, muchas gracias por jugar!!!");
        }
    }

    public static void juegoUsuario() {
        Scanner sc = new Scanner(System.in);

        int nUsu = 0, cont = 1;
        int min = 1, max = 100, nRandom;
        nRandom = aleatorio(min, max);
        boolean acierto = false;
        do {

            System.out.print("Introduce el número que crees que es 🔮: ");
            nUsu = sc.nextInt();
            
            if (nUsu == nRandom) {
                System.out.println("Enhorabuena has acertado, has necesitado " + cont + " intentos");
                acierto = true;
            }
            if (nUsu < nRandom) {
                System.out.println("El número generado es mayor");

            }
            if (nUsu > nRandom) {
                System.out.println("El número generado es menor");

            }
            cont++;
        } while (acierto == false);
        seguirJugando();
    }

    public static void juegaMaquina() {
        Scanner sc = new Scanner(System.in);
        int min = 1, max = 100, nMaquina = 0, contador = 1;
        String respuesta = "";

        System.out.println("Piensa un número, el cual te acertaré JA JA JA");
        do {

            nMaquina = aleatorio(min, max);
            System.out.println("El número que creo es... " + nMaquina);
            do {
                System.out.print("El número introducido es (correcto/menor/mayor) ");
                respuesta = sc.nextLine();
                if (!(respuesta.equals("correcto") || respuesta.equals("menor")
                        || respuesta.equals("mayor"))) {
                    System.out.print("Respuesta incorrecta vuelve a introducir -> ");
                    respuesta = sc.nextLine();

                }
            } while (!(respuesta.equals("correcto") || respuesta.equals("menor")
                    || respuesta.equals("mayor")));

            if (!(respuesta.equalsIgnoreCase("correcto"))) {

                if (respuesta.equalsIgnoreCase("menor")) {
                    max = nMaquina - 1;
                    contador++;
                } else if (respuesta.equalsIgnoreCase("mayor")) {
                    min = nMaquina + 1;
                    contador++;
                    if (nMaquina >= 100) {
                        min = 100;
                    }
                }

            }

        } while (!(respuesta.equalsIgnoreCase("correcto")));
        System.out.println("He necesitado " + contador + " intentos y el número correcto es: " + nMaquina);
        seguirJugando();

    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

}
