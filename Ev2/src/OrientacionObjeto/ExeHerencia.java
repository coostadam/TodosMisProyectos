/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class ExeHerencia {
    public static void main(String[] args) {
        
        HerenciaTest1[] persona = new HerenciaTest1[5];
        persona[0] = new HerenciaAlumno(7, "DAM", "Alumno", "Darius", "Benta", 11);
        persona[1] = new HerenciaProfesor("Progamación", "Informática", "Profesor", "Enrique", "Nogal", 16);
        persona[2] = new HerenciaAlumno(7, "DAM", "Alumno", "Darius", "Benta", 11);
        persona[3] = new HerenciaAsignatura(71, "Peter", "Sistemas", "Informatica");
        
        System.out.println("El profe es " + persona[1].getNombre());
        
        System.out.println("La edad es: " + persona[1].getEdad());
        
        System.out.println("La persona es: " + persona[0].toString());
        
        if (persona[0].equals(persona[2])) {
            System.out.println("Son la misma persona");
        }else{
            System.out.println("No son la misma persona");
        }
        
        if (persona[1] instanceof HerenciaProfesor) {
            System.out.println("Es profesor.");
        }else{
            System.out.println("No es profesor.");
        }
        
        if (persona[3] instanceof HerenciaAsignatura) {
            
        }
    }
}
