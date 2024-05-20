/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.costa.examen.dao.interfaces;

import com.costa.examen.dao.pojo.Coche;
import java.util.List;

/**
 *
 * @author dev
 */
public interface CocheDAO {

    public List<Coche> getCoche(String matricula, String modelo, String marca, String color) throws Exception;
    
}
