/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.costa.examen.dao.implementations;

import com.costa.examen.dao.interfaces.CocheDAO;
import com.costa.examen.dao.pojo.Coche;
import com.costa.examen.dao.utils.Configuration;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author dev
 */
public class CocheDAOimpl implements CocheDAO, AutoCloseable {

    static {
        try {
            Class.forName(Configuration.DRIVER);
        } catch (ClassNotFoundException ex) {
            System.exit(1);
        } catch (Exception e) {
            System.exit(1);
        }
    }
    Connection con = null;

    public CocheDAOimpl() throws Exception {
        con = DriverManager.getConnection(Configuration.URL);
    }

    @Override
    public List<Coche> getCoche(String matricula, String modelo, String marca, String color) throws Exception {
        int cont = 0;
        List<Coche> al = new ArrayList<>();
        Coche c;
        String sentencia = "SELECT matricula, modelo, marca, color from coche WHERE 1 = 1 ";

        if (matricula != null && !matricula.equals("")) {
            sentencia = sentencia + " AND matricula = ?";
        }
        if (modelo != null && !modelo.equals("")) {
            sentencia = sentencia + " AND modelo = ?";
        }
        if (marca != null && !marca.equals("")) {
            sentencia = sentencia + " AND marca = ?";
        }
        if (color != null && !color.equals("")) {
            sentencia = sentencia + " AND color = ?";
        }

        ResultSet rs = null;

        try (PreparedStatement pstm = con.prepareStatement(sentencia);) {
            if (matricula != null && !matricula.equals("")) {
                cont++;
                pstm.setString(cont, matricula);
            }
            if (modelo != null && !modelo.equals("")) {
                cont++;
                pstm.setString(cont, modelo);
            }
            if (marca != null && !marca.equals("")) {
                cont++;
                pstm.setString(cont, marca);
            }
            if (color != null && !color.equals("")) {
                cont++;
                pstm.setString(cont, color);
            }

            rs = pstm.executeQuery();
            
            while(rs.next()){
                c = new Coche(rs.getString("matricula"), rs.getString("modelo"), rs.getString("marca"), rs.getString("color"));
                al.add(c);
            }
            
        } catch (Exception e) {
            throw e;
        }
        return al;
    }

    @Override
    public void close() throws Exception {
        con.close();
    }

}
