 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rol.personajes;

import com.rol.personajes.exceptions.IncorrectColor;
import java.util.ArrayList;

/**
 *
 * @author dev
 */
public class Clan {
    private String texto;
    private String nombre;
    private ArrayList<Personaje> al = new ArrayList<>();

    public Clan(String texto, String nombre) {
        this.texto = texto;
        this.nombre = nombre;
    }
    
    public void anadirPers(Personaje p){
        this.al.add(p);
    }

    public ArrayList<Personaje> getAl() {
        return al;
    }

    public void setAl(ArrayList<Personaje> al) {
        this.al = al;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clan{" + "texto=" + texto + ", nombre=" + nombre + ", al=" + al + '}';
    }
    
    public void pocimaTogaGris(){
        for (Personaje p : al) {
            if (p instanceof Mago) {
                if (((Mago) p).getColorToga().equalsIgnoreCase("Gris")) {
                    p.pocimaSanadora();
                }
            }
        }
    }
    
    public void cambiarToga() throws IncorrectColor{
        for (Personaje p : al) {
            if (p instanceof Mago) {
                if (((Mago) p).getColorToga().equalsIgnoreCase("Verde")) {
                    ((Mago) p).setColorToga("Blanco");
                }
            }
        }
    }
    
    public double vidaMediaElfosClan(){
        int e = 0;
        int vidaTotal = 0;
        for (Personaje p : al) {
            if (p instanceof Elfo) {
                e++;
               vidaTotal = vidaTotal + p.getPuntosVida();
            }
        }
        return 1.0d * vidaTotal / e;
        
    }
    
    
}
