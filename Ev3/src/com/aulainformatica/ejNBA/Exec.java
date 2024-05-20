/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.ejNBA;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Exec {

    public final static String URL = "jdbc:mysql://localhost:3306/NBA";
    public final static String USER = "root";
    public final static String PASS = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        String resp = "";

        do {
            System.out.println("1 - Para consultar jugadores mediante filtros. ");
            System.out.println("2 - Para consultar detalles de un jugador. ");
            System.out.println("3 - Para consultar número de victorias y derrotas de un equipo en una temporada. ");
            System.out.print("¿Que deseas hacer? ('S' para salir) -> ");
            resp = sc.nextLine();
            if (!resp.equalsIgnoreCase("s")) {
                if (resp.equals("1")) {
                    consultarJugador(sc);
                }
                if (resp.equals("2")) {
                    detalleJugador(sc);
                }
                if (resp.equals("3")) {
                    estadisticaEquipo(sc);
                }
            }
        } while (!resp.equalsIgnoreCase("S"));

    }

    public static void consultarJugador(Scanner sc) {
        System.out.println("Consulta de jugadores usando filtros.");
        String nombreEquipo;
        String ciudadEquipo;
        String conferencia;
        String division;
        int cont = 0;

        System.out.print("Dime el nombre del equipo: ");
        nombreEquipo = sc.nextLine();
        System.out.print("Dime la ciudad del equipo: ");
        ciudadEquipo = sc.nextLine();
        System.out.print("Dime la conferencia del equipo: ");
        conferencia = sc.nextLine();
        System.out.print("Dime la división del equipo: ");
        division = sc.nextLine();

        String sentencia = "SELECT codigo, jugadores.nombre, nombre_equipo from jugadores JOIN equipos ON jugadores.Nombre_equipo=equipos.Nombre where 1=1 ";

        if (nombreEquipo != null && !nombreEquipo.equals("")) {
            sentencia = sentencia + " AND Nombre_equipo = ?";
        }
        if (ciudadEquipo != null && !ciudadEquipo.equals("")) {
            sentencia = sentencia + " AND equipos.Ciudad = ?";
        }
        if (conferencia != null && !conferencia.equals("")) {
            sentencia = sentencia + " AND conferencia = ?";
        }
        if (division != null && !division.equals("")) {
            sentencia = sentencia + " AND division = ?";
        }
        
        ResultSet rs = null;
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS); 
                PreparedStatement pstm = con.prepareStatement(sentencia);) {
            if (nombreEquipo != null && !nombreEquipo.equals("")) {
                cont++;
                pstm.setString(cont, nombreEquipo);
            }
            if (ciudadEquipo != null && !ciudadEquipo.equals("")) {
                cont++;
                pstm.setString(cont, ciudadEquipo);
            }
            if (conferencia != null && !conferencia.equals("")) {
                cont++;
                pstm.setString(cont, conferencia);
            }
            if (division != null && !division.equals("")) {
                cont++;
                pstm.setString(cont, division);
            }
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                System.out.print(rs.getInt(1) + " --- ");
                System.out.print(rs.getString(2) + " --- ");
                System.out.println(rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.print("Error: ");
            ex.printStackTrace();
        }finally{
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void detalleJugador(Scanner sc) {
        System.out.println("Consulta de los detalles de jugador.");
        
        System.out.print("¿Cual es su id? -> ");
        int id = Integer.parseInt(sc.nextLine());
        
        String sentencia = "SELECT j.*,e.temporada ,e.puntos_por_partido, e.asistencias_por_partido, e.tapones_por_partido, e.rebotes_por_partido "
                + "FROM jugadores AS j JOIN estadisticas AS e ON e.jugador = j.codigo "
                + "WHERE j.codigo = ?";
        
         
        ResultSet rs = null;
        try (Connection con = DriverManager.getConnection(URL, USER, PASS); 
                PreparedStatement pstm = con.prepareStatement(sentencia);) {
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                System.out.print("Código del jugador: " + rs.getInt(1) + " --- ");
                System.out.print(" Nombre: " + rs.getString(2) + " --- ");
                System.out.println(" Procedencia: " + rs.getString(3) + " --- ");
                System.out.print(" Altura: " + rs.getString(4) + " --- ");
                System.out.print(" Peso: " + rs.getInt(5) + " --- ");
                System.out.print(" Posición: " + rs.getString(6) + " --- ");
                System.out.print(" Equipo: " +rs.getString(7) + " --- ");
                System.out.println(" Temporada: " + rs.getString(8) + " --- ");
                System.out.print(" Puntos por partido: " + rs.getFloat(9) + " --- ");
                System.out.print(" Asistencias por partido: " + rs.getFloat(10) + " --- ");
                System.out.print(" Tapones por partido: " + rs.getFloat(11) + " --- ");
                System.out.println(" Rebotes por partido: " + rs.getFloat(12));
                
            }
        } catch (SQLException ex) {
            System.out.print("Error: ");
            ex.printStackTrace();
        }
    }

    public static void estadisticaEquipo(Scanner sc) {
        System.out.println("Mostrando las estadisticas de un equipo en una temporada.");
        System.out.print("¿Cual es el nombre del equipo? -> ");
        String nombre = sc.nextLine();
        System.out.print("¿Cual es la temporada? -> ");
        String temp = sc.nextLine();
        String sentencia = "SELECT COUNT(*) AS Victorias " +
                           "FROM partidos " +
                           "WHERE ((equipo_local = ? AND puntos_local > puntos_visitante) " +
                           "OR (equipo_visitante = ? AND puntos_visitante > puntos_local)) " +
                           "AND temporada = ?";
        
        String sentenciaDerrotas = "SELECT COUNT(*) AS Derrotas " +
                           "FROM partidos " +
                           "WHERE ((equipo_local = ? AND puntos_local < puntos_visitante) " +
                           "OR (equipo_visitante = ? AND puntos_visitante < puntos_local)) " +
                           "AND temporada = ?";
            
         ResultSet rs = null;
         ResultSet rsD = null;
         
        try( Connection con = DriverManager.getConnection(URL, USER, PASS);
               PreparedStatement pstm = con.prepareStatement(sentencia);
                PreparedStatement pstmD = con.prepareStatement(sentenciaDerrotas);
                ){
            
            pstm.setString(1, nombre);
            pstm.setString(2, nombre);
            pstm.setString(3, temp);
            
            pstmD.setString(1, nombre);
            pstmD.setString(2, nombre);
            pstmD.setString(3, temp);
            
            rs = pstm.executeQuery();
            while(rs.next()){
                System.out.println("Victorias: " + rs.getInt(1));
            }
            
            rsD = pstmD.executeQuery();
            while(rsD.next()){
                System.out.println("Derrotas: " + rsD.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();               
                }
            }
            if(rsD != null){
                try {
                    rsD.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
