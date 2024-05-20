/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author dev
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int[] nums = new int[20];
        int sumaNum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = aleatorio(-10, 10);
            System.out.println("El numero " + i + " es: " + nums[i]);
        }
        for (int num : nums) {
            sumaNum += num;
        }
        System.out.println("La suma de los numeros es: " + sumaNum);
        double mediaNum = 0;
        mediaNum = 1.0d * sumaNum / nums.length;
        System.out.println("La media es: " + mediaNum);

    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

}
