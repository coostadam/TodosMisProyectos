/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rol.personajes;

import com.rol.personajes.exceptions.*;

/**
 *
 * @author dev
 */
public abstract class Personaje {
    private String codigo;
    private String nombre;
    private int puntosVida;
    private int puntosExp;
    private boolean muerto = false;

    public Personaje(String codigo, String nombre, int puntosVida, int puntosExp) throws TooLowNumber {
        this.codigo = codigo;
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.setPuntosExp(puntosExp);
    }

    public int getPuntosExp() {
        return puntosExp;
    }

    public void setPuntosExp(int puntosExp) throws TooLowNumber {
        if (puntosExp < 0) {
            throw new TooLowNumber("Número bajo cero");
        }else{
            this.puntosExp = puntosExp;
        }
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    @Override
    public String toString() {
        return "Personaje{" + "codigo=" + codigo + ", nombre=" + nombre + ", puntosVida=" + puntosVida + ", puntosExp=" + puntosExp + ", muerto=" + muerto + '}' + "\n";
    }
    
    public int herir(int herida){
        
        return this.puntosVida - herida;
        
    }
    
    public boolean isMuerto(boolean muerto){
        if (0 <= this.puntosVida) {
            return this.muerto = true;
        }
        return false;   
    }
    
    public abstract void pocimaSanadora();
}
