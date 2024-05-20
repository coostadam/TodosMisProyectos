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
public class GrupoAlumnos {
    private String titulacion;
    private int curso;
    private String turno;
    private Alumno[] alumno;

    public GrupoAlumnos(String titulacion, int curso, String turno, Alumno[] alumno) {
        this.titulacion = titulacion;
        this.curso = curso;
        this.turno = turno;
        this.alumno = alumno;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumno = alumno;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Alumno getBestAlumno(){
        double mejorNota = Integer.MIN_VALUE;
        Alumno bestAlumno = null;
        for (Alumno alumno1 : this.alumno) {
            if (alumno1.getNota() > mejorNota) {
                mejorNota = alumno1.getNota();
                bestAlumno = alumno1;
            }
        }
       
        return bestAlumno;
    }
    public double getEdadMediaDias(){
        double suma = 0;
        
        for (Alumno alumno1 : this.alumno) {
            suma +=  LocalDate.now().toEpochDay() - alumno1.getfNac().toEpochDay();
        }
        
        return 1.0d * suma / this.alumno.length;
    } 
}
