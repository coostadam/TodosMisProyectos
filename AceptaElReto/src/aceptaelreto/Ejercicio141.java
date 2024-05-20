/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aceptaelreto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Ejercicio141 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> al = new ArrayList<>();
        String resp;
        boolean salida = true;
        while (sc.hasNextLine()) {
            resp = sc.nextLine();
            for (int i = 0; i < resp.length(); i++) {
                if (resp.charAt(i) == '(' || resp.charAt(i) == '{' || resp.charAt(i) == '[') {
                    al.add(resp.charAt(i));
                } else if(resp.charAt(i) == ')' || resp.charAt(i) == '}' || resp.charAt(i) == ']'){
                    if (al.size() == 0) {
                        salida = false;
                        break;
                    }else{
                        if (resp.charAt(i) == ')' && al.get(al.size() - 1) == '(') {
                            al.remove(al.size() - 1);
                        }else if(resp.charAt(i) == '}' && al.get(al.size() - 1) == '{'){
                            salida = false;
                            break;
                        }else if(resp.charAt(i) == ']' && al.get(al.size() - 1) == '['){
                            salida = false;
                            break;
                        }
                    }
                }
            }
            if (salida) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            al.clear();
        }
    }
}
