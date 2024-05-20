/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtras;

/**
 *
 * @author dev
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int horas = 0, mins = 0, seg = 0;
        do {
            System.out.printf("%02d:%02d:%02d%n", horas, mins ,seg);
//            System.out.println(horas + ":"+ mins + ":"+ seg);
            seg++;
            if (seg == 60){
                mins++;
                seg = 0;
            }
            if (mins == 60){
                horas++;
                mins = 0;
            }
        } while (!(horas == 24) && !(mins == 60) && !(seg == 60));
    }
}
