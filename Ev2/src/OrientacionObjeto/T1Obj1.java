/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

import OrientacionObjeto.Obj1;
import java.util.Scanner;

public class T1Obj1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Obj1 pilotoUno = new Obj1("Alonso");
        Obj1 pilotoDos = new Obj1("Sainz");
        Obj1 pilotoTres = new Obj1("Verstappen");

        pilotoUno = new Obj1(300);
        
        pilotoUno.tiempo(1200);
        System.out.println("A tardado " + pilotoUno.tiempo);
        
        System.out.print("Cuantos litros de gasolina tiene el coche " + pilotoDos.coche + ":");
        pilotoUno = new Obj1(sc.nextDouble());
        sc.nextLine();
        
        pilotoDos.repostaje(40);
        System.out.println("Ahora tiene " + pilotoDos.gasolina);

        System.out.print("Dime el nombre: ");
        pilotoTres.piloto = sc.nextLine();

        System.out.print("Dime el coche: ");
        pilotoTres.coche = sc.nextLine();

        System.out.print("Dime la escuderia: ");
        pilotoTres.escuderia = sc.nextLine();

        System.out.print("Dime la velocidad: ");
        pilotoTres.velocidad = sc.nextInt();

        System.out.println("Su nombre es: " + pilotoTres.piloto);
        System.out.println("Su coche es: " + pilotoTres.coche);
        System.out.println("Su escuderia es: " + pilotoTres.escuderia);
        System.out.println("Su velocidad es: " + pilotoTres.velocidad);

        System.out.print("Cual es su gasolina: ");
        pilotoTres.gasolina = sc.nextDouble();
        System.out.print("Cuantos litros va a repostar: ");
        pilotoTres.repostaje(sc.nextInt());
        
        System.out.println("Ahora tiene " + pilotoTres.gasolina + " litros de gasolina.");
    }

}
