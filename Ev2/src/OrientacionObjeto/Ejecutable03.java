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
public class Ejecutable03 {
    public static void main(String[] args) {
        Alumno[] aArray = new Alumno[10];
        aArray[0] = new Alumno("Javi", LocalDate.parse("2005-01-21"), 6);
        aArray[1] = new Alumno("Darius", LocalDate.parse("2000-04-12"), 6.5);
        aArray[2] = new Alumno("Edu", LocalDate.parse("2001-05-21"), 7);
        aArray[3] = new Alumno("Angel", LocalDate.parse("2003-06-09"), 8);
        aArray[4] = new Alumno("Antonio", LocalDate.parse("2004-11-17"), 3);
        aArray[5] = new Alumno("Domingo", LocalDate.parse("1983-10-11"), 9);
        aArray[6] = new Alumno("Marcos", LocalDate.parse("2005-09-01"), 6.3);
        aArray[7] = new Alumno("Raúl", LocalDate.parse("2002-03-19"), 7.3);
        aArray[8] = new Alumno("Miguel", LocalDate.parse("2004-06-08"), 8.9);
        aArray[9] = new Alumno("Leo", LocalDate.parse("2002-04-12"), 7.9);
        GrupoAlumnos grupo = new GrupoAlumnos("DAM", 2, "Tarde", aArray);
        System.out.println("El mejor alumno es " + grupo.getBestAlumno());
        System.out.println("La edad media en dias es " + grupo.getEdadMediaDias());
    }
}
