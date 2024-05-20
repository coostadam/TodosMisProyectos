/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class Ejecutable01 {

    public static void main(String[] args) {


        Componente[] cArray = new Componente[4];
        cArray[0] = new Componente("Rueda", 23);
        cArray[1] = new Componente("Manillar", 12);
        cArray[2] = new Componente("Cuadro", 45);
        cArray[3] = new Componente("Freno", 10);
        Bicicleta b1 = new Bicicleta("Bicicleton", "B", "rojo", "Carretera", "1234", cArray);
        System.out.println("El peso de los componentes es: " + b1.getSumaPesoComponentes());

    }
}
