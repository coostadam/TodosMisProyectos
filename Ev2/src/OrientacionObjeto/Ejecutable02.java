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
public class Ejecutable02 {
    public static void main(String[] args) {
        MiembroConsejo[] miembrosConsejo = new MiembroConsejo[3];
        miembrosConsejo[0] = new MiembroConsejo("Pepe", LocalDate.parse("2001-05-20"));
        miembrosConsejo[1] = new MiembroConsejo("Sara", LocalDate.parse("2002-05-20"));
        miembrosConsejo[2] = new MiembroConsejo("Antonio", LocalDate.parse("2000-05-20"));
        
        Empresa e = new Empresa("Los Informáticos S.A", miembrosConsejo);
        
        System.out.println("El secretario es: " + e.getSecretario().getNombre());
    }
}
