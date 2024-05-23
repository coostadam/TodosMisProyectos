/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.costa.dao.pojo;

/**
 *
 * @author dev
 */
public class Casa {
   private String id;
   private String direccion;
   private String poblacion;
   private String provincia;

    public Casa(String id, String direccion, String poblacion, String provincia) {
        this.id = id;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", direccion=" + direccion + ", poblacion=" + poblacion + ", provincia=" + provincia + '}';
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
}
