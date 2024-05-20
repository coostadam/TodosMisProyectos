/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class HerenciaAsignatura extends HerenciaProfesor {
    private int codigoAsignatura;
    private String profesor;

    
    public HerenciaAsignatura(int codigoAsignatura, String profesor, String modulo, String dept) {
        super(modulo, dept);
        this.codigoAsignatura = codigoAsignatura;
        this.profesor = profesor;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

   
    
    
    
}
