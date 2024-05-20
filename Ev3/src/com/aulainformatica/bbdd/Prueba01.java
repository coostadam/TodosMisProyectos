/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulainformatica.bbdd;

import java.sql.*;

/**
 *
 * @author dev
 */
public class Prueba01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            System.exit(1);
        }
        
        //Hacemos una consulta 
        String sentencia = "select id, nombre, dni, jefe from EMPLEADO;";
        
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sentencia);
                ){
             while(rs.next()){
                 System.out.println("---------------");
                 System.out.print("id:" + rs.getInt("id") + " nombre:");
                 System.out.print(rs.getString(2) + " dni:");
                 System.out.print(rs.getString("dni") + " jefe:");
                 System.out.println(rs.getInt("jefe"));
             }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        //Usamos updates
        System.out.println("---------------");
        String sentenciaUpdate = "update EMPLEADO set jefe = 10 where jefe = 15;";
        
        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root" , "");
               Statement stm = con.createStatement();
                ){
           int r = stm.executeUpdate(sentenciaUpdate);
           System.out.println("Han cambiado " + r + " registros.");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
