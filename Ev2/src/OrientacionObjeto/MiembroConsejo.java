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
public class MiembroConsejo {
    private String nombre;
    private LocalDate fNac;

    public MiembroConsejo(String nombre, LocalDate fNac) {
        this.nombre = nombre;
        this.fNac = fNac;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
