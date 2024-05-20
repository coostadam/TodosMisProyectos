/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

import java.util.Objects;

/**
 *
 * @author dev
 */
public class HerenciaTest1 {

    private String persona;
    private String Nombre;
    private String Apellido;
     int edad;

    public HerenciaTest1(String persona, String Nombre, String Apellido, int edad) {
        this.persona = persona;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public HerenciaTest1() {
        
    }

    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "HerenciaTest1{" + "persona=" + persona + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + '}';
    }
 
    public void verifyEdad(int edad) {
        if(this.edad < 18){
            this.edad = 18;
        }else{
            this.edad = edad;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HerenciaTest1 other = (HerenciaTest1) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return Objects.equals(this.Apellido, other.Apellido);
    }

    
    
}
