/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.costa.dao.implementations;

import com.examen.costa.dao.interfaces.CasaDAO;
import com.examen.costa.dao.pojo.Casa;
import com.examen.costa.dao.utils.Configuration;
import java.sql.*;

/**
 *
 * @author dev
 */
public class CasaDAOimpl implements CasaDAO, AutoCloseable {

    static {
        try {
            Class.forName(Configuration.DRIVER);
        } catch (ClassNotFoundException ex) {
            System.exit(1);
        }
    }

    Connection con = null;

    public CasaDAOimpl() throws Exception {
        con = DriverManager.getConnection(Configuration.URL);
    }

    @Override
    public int addRegistro(Casa c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void close() throws Exception {
        con.close();
    }

}
