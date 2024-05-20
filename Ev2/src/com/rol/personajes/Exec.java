/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rol.personajes;

import com.rol.personajes.exceptions.IncorrectColor;
import com.rol.personajes.exceptions.TooLowNumber;
import java.util.*;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) throws TooLowNumber, IncorrectColor {
        Scanner sc = new Scanner(System.in);
        String res = "";
        Mago m1 = new Mago("Gris", 12.4, "M001", "Pajas", 110, 15);
        Mago m2 = new Mago("Verde", 17.4, "M002", "Lula", 90, 25);
        Elfo e1 = new Elfo(8.9, 5, "E001", "Luka", 75, 7);
        Elfo e2 = new Elfo(9.9, 7, "E002", "Doncic", 67, 12);
        Clan c1 = new Clan("C001", "Clan1");
        Clan c2 = new Clan("C002", "Clan2");
        c1.anadirPers(m1);
        c1.anadirPers(e1);
        c2.anadirPers(e2);
        c2.anadirPers(m2);

        ArrayList<Clan> alC = new ArrayList<>();

        alC.add(c1);
        alC.add(c2);

        do {
            System.out.println("Pon 1 para listar clanes.");
            System.out.println("Pon 2 para dar pócima a todos los magos de toga gris.");
            System.out.println("Pon 3 para cambiar la toga de verde a blanco.");
            System.out.println("Pon 4 para mostrar vida media de los elfos en los clanes.");
            System.out.println("Pon 5 para mostrar vida media de cada personaje.");
            System.out.println("Pon 'S' para salir");
            System.out.print("Que desea hacer ->  ");
            res = sc.nextLine();
            if (!res.equalsIgnoreCase("S")) {
                if (res.equals("1")) {
                    listarClan(alC);
                } else if (res.equals("2")) {
                    darPocimaTogaGris(alC);
                }else if (res.equals("3")) {
                    cambiarColorToga(alC);
                }else if(res.equals("4")){
                    vidaMediaElfos(alC);
                }else if(res.equals("5")){
                    vidaMediaByPers(alC);
                }
            }
        } while (!res.equalsIgnoreCase("S"));
    }

    public static void listarClan(ArrayList<Clan> alC) {
        System.out.println("-----Listando clanes-----");
        for (Clan clan : alC) {
            System.out.println(clan);
            System.out.println();

        }
    }

    public static void darPocimaTogaGris(ArrayList<Clan> alC) {
        System.out.println("-----Dando pocimas a magos con toga gris-----");
        for (Clan clan : alC) {
            clan.pocimaTogaGris();
        }

    }

    public static void cambiarColorToga(ArrayList<Clan> alC) throws IncorrectColor {
        System.out.println("-----Cambiando de color la toga-----");
        for (Clan clan : alC) {
            clan.cambiarToga();
        }
    }

    public static void vidaMediaElfos(ArrayList<Clan> alC) {
        System.out.println("-----Vida media de los elfos-----");
        for (Clan c : alC) {
            System.out.println("Clan: " + c.getNombre());
            System.out.println("Vida media de los elfos: " + c.vidaMediaElfosClan());
        }
        
    }

    private static void vidaMediaByPers(ArrayList<Clan> alC) {
        
    }
}
