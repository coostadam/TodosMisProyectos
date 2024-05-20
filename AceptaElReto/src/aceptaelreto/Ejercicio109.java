/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.*;

/**
 *
 * @author dev
 */
// Ej de la liga de pádel realizado por Alejandro Costa y Domingo Cabrero.
public class Ejercicio109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> equipos = new HashMap<>();
        String resp, cat;
        int cont;
        do {
            cat = sc.nextLine();
            if (!cat.equals("FIN")) {
                cont = 0;
                do {
                    resp = sc.nextLine();
                    if (!resp.equals("FIN")) {
                        setEquipos(resp, equipos);
                        cont++;
                    }
                } while (!resp.equals("FIN"));
                mostrarOutPut(equipos, cont);
            }
            equipos.clear();
        } while (!cat.equals("FIN"));
    }

    public static void setEquipos(String resp, Map<String, Integer> equipos) {
        String[] equipo = resp.split(" ");
        String local = equipo[0];
        int puntosLocal = Integer.parseInt(equipo[1]);
        String visitante = equipo[2];
        int puntosVis = Integer.parseInt(equipo[3]);
        if (puntosLocal > puntosVis) {
            addPuntos(equipos, local, 2);
            addPuntos(equipos, visitante, 1);
        } else {
            addPuntos(equipos, local, 1);
            addPuntos(equipos, visitante, 2);
        }
    }
    

    public static void addPuntos(Map<String, Integer> equipos, String equipo, int puntos) {
        if (!equipos.containsKey(equipo)) {
            equipos.put(equipo, puntos);
        } else {
            equipos.put(equipo, equipos.get(equipo) + puntos);
        }
    }

    public static void mostrarOutPut(Map<String, Integer> equipos, int cont) {
        String ganador = "";
        int pGanador = Integer.MIN_VALUE;
        int pRestantes = (equipos.size() * (equipos.size() - 1)) - cont;
        for (String team : equipos.keySet()) {
            if (equipos.get(team) > pGanador) {
                pGanador = equipos.get(team);
                ganador = team;
            } else if (equipos.get(team) == pGanador) {
                ganador = "EMPATE";
            }
        }
        System.out.println(ganador + " " + pRestantes);
    }
}
