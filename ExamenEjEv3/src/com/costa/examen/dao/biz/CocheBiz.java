/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.costa.examen.dao.biz;

import com.costa.examen.dao.implementations.CocheDAOimpl;
import com.costa.examen.dao.pojo.Coche;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author dev
 */
public class CocheBiz {
    
    public List<Coche> getCoche(String matricula, String modelo, String marca, String color) throws Exception{
        List<Coche> c = new ArrayList<>();
        try (CocheDAOimpl impl = new CocheDAOimpl();) {
            c = impl.getCoche(matricula, modelo, marca, color);
        } catch (Exception ex) {
            throw ex;
        }
        return c;
    }
    
    public void addCsv(String fileName, Coche c) throws Exception {
        File f = new File(fileName);
        
        try (FileWriter fw = new FileWriter(f, true);
                ){
            fw.write(c.toCsv() + "\n");
        } catch (Exception ex) {
            throw ex;
        }
    }
}
