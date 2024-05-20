/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class HerenciaAlumno extends HerenciaTest1 {
    int nota;

    public HerenciaAlumno(int nota, String grupo, String persona, String Nombre, String Apellido, int edad) {
        super(persona, Nombre, Apellido, edad);
        this.nota = nota;
        this.grupo = grupo;
    }
    String grupo;
    
     public void verifyEdad(int edad) {
        if(super.getEdad() <= 12){
            super.edad = 12;
        }else{
            super.edad = edad;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "HerenciaAlumno{" + "nota=" + nota + ", grupo=" + grupo + '}';
    }
    
    

}
