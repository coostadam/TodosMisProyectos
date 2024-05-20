/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public class Utils {
    public static int getAleatorio(int min, int max){
         return (int) (Math.random() * (max - min + 1) + min);
    }
    public static double getHipotenusa(double c1, double c2){
        return Math.sqrt(Math.pow(c1, 2) +  Math.pow(c2, 2));
    }
}
