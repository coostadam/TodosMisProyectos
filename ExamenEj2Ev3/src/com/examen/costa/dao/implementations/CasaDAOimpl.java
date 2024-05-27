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
    public void deleteRegistros() throws Exception {
        String sentencia = "DELETE FROM casa ";
        
        try(PreparedStatement pstm = con.prepareStatement(sentencia);
                ){
            
            pstm.execute();
            
        }catch (Exception e){
            throw e;
        }
    }
    
    @Override
    public int addRegistro(Casa c) throws Exception {
        int cont = 0;
        
        String sentencia = "insert into casa values(?,?,?,?) ";
        
        try(PreparedStatement pstm = con.prepareStatement(sentencia);
                ){
            pstm.setString(1, c.getId());
            pstm.setString(2, c.getDireccion());
            pstm.setString(3, c.getPoblacion());
            pstm.setString(4, c.getProvincia());
            
            cont += pstm.executeUpdate();
        }catch (Exception e){
            throw e;
        }
        return cont;
    }

    @Override
    public void close() throws Exception {
        con.close();
    }
}
