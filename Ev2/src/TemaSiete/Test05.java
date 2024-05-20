/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaSiete;

import java.util.*;

/**
 *
 * @author dev
 */
public class Test05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respUsu = "";
        ArrayList<JugadorBaloncesto> jugs = new ArrayList<>();
        JugadorBaloncesto uno = new JugadorBaloncesto("Pepe", 12, "Estudiantes", 12, "Alava");
        JugadorBaloncesto dos = new JugadorBaloncesto("Juan", 17, "Real Madrid", 16, "Zamora");
        JugadorBaloncesto tres = new JugadorBaloncesto("Carlos", 22, "Barcelona", 92, "Madrid");
        jugs.add(uno);
        jugs.add(dos);
        jugs.add(tres);
        do {

            System.out.println("Pon '1' para añadir un nuevo jugador.");
            System.out.println("Pon '2' para ver todos los jugadores.");
            System.out.println("Pon '3' para buscar mediante nombres.");
            System.out.println("Pon '4' para buscar mediante provincias.");
            System.out.println("Pon '5' para modificar las canastas de un jugador .");
            System.out.println("Pon '6' para buscar ordenado por provincias.");
            System.out.println("Pon '7' para borrar por canastas.");
            System.out.println("Pon '8' para borrar todos los registros.");
            System.out.println("Pon '9' para terminar");
            System.out.print("¿Que quieres hacer? ");

            respUsu = sc.nextLine();

            if (!respUsu.equalsIgnoreCase("9")) {
                if (respUsu.equalsIgnoreCase("1")) {
                    System.out.println("---------------------------------------");
                    introducirPlayer(jugs, sc);
                } else if (respUsu.equalsIgnoreCase("2")) {
                    System.out.println("---------------------------------------");
                    mostrarPlayer(jugs);
                } else if (respUsu.equalsIgnoreCase("3")) {
                    System.out.println("---------------------------------------");
                    consultaNombre(jugs, sc);
                } else if (respUsu.equalsIgnoreCase("4")) {
                    System.out.println("---------------------------------------");
                    consultaProvincia(jugs, sc);
                } else if (respUsu.equalsIgnoreCase("5")) {
                    System.out.println("---------------------------------------");
                    modificarCanastas(jugs, sc);
                } else if (respUsu.equalsIgnoreCase("6")) {
                    System.out.println("---------------------------------------");
                    ordenadoProvincias(jugs);
                } else if (respUsu.equalsIgnoreCase("7")) {
                    System.out.println("---------------------------------------");
                    borradoPorCanastas(jugs, sc);
                } else if (respUsu.equalsIgnoreCase("8")) {
                    System.out.println("---------------------------------------");
                    borradoTotal(jugs);
                }
            }

        } while (!respUsu.equalsIgnoreCase("9"));
    }

    public static void introducirPlayer(List<JugadorBaloncesto> jugs, Scanner sc) {
        System.out.println("Añade los datos...");

        System.out.print("Añade el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Añade la edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Añade el equipo: ");
        String equipo = sc.nextLine();

        System.out.print("Añade las canastas introducidas: ");
        int canastas = Integer.parseInt(sc.nextLine());

        System.out.print("Añade la provincia: ");
        String prov = sc.nextLine();

        JugadorBaloncesto jug = new JugadorBaloncesto(nombre, edad, equipo, canastas, prov);

        jugs.add(jug);
        System.out.println("---------------------------------------");

    }

    public static void mostrarPlayer(List<JugadorBaloncesto> jugs) {
        System.out.println("Datos de jugadores:");

        for (JugadorBaloncesto jug : jugs) {
            System.out.println(jug);
        }
        System.out.println("---------------------------------------");

    }

    public static void consultaNombre(List<JugadorBaloncesto> jugs, Scanner sc) {
        System.out.print("Con que nombre quieres filtrar: ");
        String nombre = sc.nextLine();
        for (JugadorBaloncesto jug : jugs) {
            if (nombre.equalsIgnoreCase(jug.getNombre())) {
                System.out.println(jug);
            } else {
                System.out.println("No hay jugadores con ese nombre.");
            }
        }
        System.out.println("---------------------------------------");
    }

    public static void consultaProvincia(List<JugadorBaloncesto> jugs, Scanner sc) {
        System.out.print("Porque provincia quieres filtrar: ");
        String provincia = sc.nextLine();
        for (JugadorBaloncesto jug : jugs) {
            if (provincia.equalsIgnoreCase(jug.getProvincia())) {
                System.out.println(jug);
            } else {
                System.out.println("No hay jugadores con esa provincia.");
            }
        }
        System.out.println("---------------------------------------");
    }

    public static void modificarCanastas(List<JugadorBaloncesto> jugs, Scanner sc) {
        System.out.print("Dime el nombre del jugador que quieres modificar sus canastas: ");
        String nombre = sc.nextLine();
        System.out.print("¿Cuantas canastas tiene nuevas? ");
        int numCanastas = sc.nextInt();
        for (JugadorBaloncesto jug : jugs) {
            if (jug.getNombre().equalsIgnoreCase(nombre)) {
                jug.setNumCanastasIntroducidas(jug.getNumCanastasIntroducidas() + numCanastas);
            }
        }

        System.out.println("---------------------------------------");

    }

    public static void ordenadoProvincias(List<JugadorBaloncesto> jugs) {
        TreeSet<String> provincia = new TreeSet<>();
        for (JugadorBaloncesto jug : jugs) {
            provincia.add(jug.getProvincia());
        }

        System.out.println("Ordenado por provincias: ");

        for (String prov : provincia) {
            for (JugadorBaloncesto jug : jugs) {
                if (jug.getProvincia().equalsIgnoreCase(prov)) {
                    System.out.println(jug);
                }
            }
        }

        System.out.println("---------------------------------------");

    }

    
   public static void borradoPorCanastas(List<JugadorBaloncesto> jugs, Scanner sc){
       System.out.println("Borrado por rango de canastas: ");
       System.out.println("Dame el minimo: ");
       int min = Integer.parseInt(sc.nextLine());
       System.out.println("Dame el máximo: ");
       int max = Integer.parseInt(sc.nextLine());
       jugs.removeIf(j -> j.getNumCanastasIntroducidas() >= min && j.getNumCanastasIntroducidas() <= max);
       
       System.out.println("---------------------------------------");

   }
   
   public static void borradoTotal(List<JugadorBaloncesto> jugs){
       jugs.clear();
   }
}
