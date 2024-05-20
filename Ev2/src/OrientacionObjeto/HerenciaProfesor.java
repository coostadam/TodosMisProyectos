/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class HerenciaProfesor extends HerenciaTest1 {
    String modulo;

    public HerenciaProfesor(String modulo, String dept, String persona, String Nombre, String Apellido, int edad) {
        super(persona, Nombre, Apellido, edad);
        this.modulo = modulo;
        this.dept = dept;
    }
    
    
    String dept;

    public HerenciaProfesor(String modulo, String dept) {
        this.modulo = modulo;
        this.dept = dept;
    }
    
    
}
