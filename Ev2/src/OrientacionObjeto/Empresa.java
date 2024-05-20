/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

import java.time.LocalDate;

/**
 *
 * @author dev
 */
public class Empresa {
    private String nombre;
    private MiembroConsejo[] miembrosConsejo;

    public Empresa(String nombre, MiembroConsejo[] miembrosConsejo) {
        this.nombre = nombre;
        this.miembrosConsejo = miembrosConsejo;
    }
    public MiembroConsejo getSecretario(){
        LocalDate actual = this.miembrosConsejo[0].getfNac();
        MiembroConsejo secretario = this.miembrosConsejo[0];
        for (MiembroConsejo miembroConsejo : this.miembrosConsejo) {
            if (miembroConsejo.getfNac().isAfter(actual)) {
                actual = miembroConsejo.getfNac();
                secretario = miembroConsejo;
            }
        }
        
        return secretario;
    }
    public MiembroConsejo[] getMiembrosConsejo() {
        return miembrosConsejo;
    }

    public void setMiembrosConsejo(MiembroConsejo[] miembrosConsejo) {
        this.miembrosConsejo = miembrosConsejo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
