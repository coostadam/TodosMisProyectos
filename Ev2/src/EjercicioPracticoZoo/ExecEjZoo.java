/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoZoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dariu
 */
//listarAnimales,AlimentarTiburonesAletaMas50,BorrarOsosOjosMarrones,pepeXPepeLuis
public class ExecEjZoo {

    public static void main(String[] args) {
        HashMap<String, Animal> animales = new HashMap<>();
        Oso o1 = new Oso("azul", "oso1", "Oso1", 45.6, 90);
        Oso o2 = new Oso("amarillo", "oso2", "Oso2", 120.99, -10);
        Oso o3 = new Oso("verde", "oso3", "Oso3", 90, 40);
        Oso o4 = new Oso("azul", "oso1", "Oso1", 32.34, 45);
        Tiburon t1 = new Tiburon(44.66, "tib1", "Tib1", 80, 55);
        Tiburon t2 = new Tiburon(60, "tib2", "Tib2", -10, 30);
        Tiburon t3 = new Tiburon(50.01, "tib2", "Tib2", 100, 76);
        Tiburon t4 = new Tiburon(32, "tib3", "Tib3", 55, 20);
        animales.put("o1", o1);
        animales.put("o2", o2);
        animales.put("o3", o3);
        animales.put("o4", o4);
        animales.put("t1", t1);
        animales.put("t2", t2);
        animales.put("t3", t4);

        listarAnimales(animales);
//        System.out.println();
//        System.out.println("------------DAR DE COMER A TIBURON MAS DE 50 EN ALETA---------------");
//        alimentarTiburonesAletaMas50(animales);
//        listarAnimales(animales);
//        System.out.println();
//        System.out.println("--------BORRAR OSOS CON OJOS AZULES-----------------");
//        borrarOsosOjosAzules(animales);
//        System.out.println("--------------CAMBIAR NOMBRE OSO-------------- ");
//        cambiarNombreOso1aOso4(animales);
//        listarAnimales(animales);
        System.out.println("--------------CAMBIAR NOMBRE OSO 2 -----------------");
        cambiarNombreOso1aOso4Prueba2(animales);
        listarAnimales(animales);

    }

    public static void listarAnimales(HashMap<String, Animal> animales) {
        for (Map.Entry<String, Animal> entry : animales.entrySet()) {
            String key = entry.getKey();
            Animal val = entry.getValue();
            System.out.println(val);

        }

    }

    public static void alimentarTiburonesAletaMas50(HashMap<String, Animal> animales) {
        for (Map.Entry<String, Animal> entry : animales.entrySet()) {
            String key = entry.getKey();
            Animal val = entry.getValue();
            if (val instanceof Tiburon t) {
                if (t.getLargoAleta() > 50) {
                    t.darDeComer();
                }
            }

        }
    }

    public static void borrarOsosOjosAzules(HashMap<String, Animal> animales) {
        ArrayList<Animal> ososEliminados = new ArrayList<>();
        for (Map.Entry<String, Animal> entry : animales.entrySet()) {
            String key = entry.getKey();
            Animal val = entry.getValue();
            if (val instanceof Oso oso) {

                if (oso.getColorOjos().equalsIgnoreCase("azul")) {
                    ososEliminados.add(oso);

                }
            }
//            if (ososEliminados.contains(val)) {
//                System.out.println("OSO ELIMINADO : " + val.toString());
//            }
            if (!ososEliminados.contains(val)) {
                System.out.println(val);
            }

        }

    }

    public static void cambiarNombreOso1aOso4(HashMap<String, Animal> animales) {
        for (Map.Entry<String, Animal> entry : animales.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            if (val instanceof Oso oso) {
                if (oso.getNombre().equalsIgnoreCase("oso1")) {
                    oso.setNombre("Oso4");
                    break;
                }
            }

        }

    }

    public static void cambiarNombreOso1aOso4Prueba2(HashMap<String, Animal> animales) {
        List<String> osoCambiar = new ArrayList<>();
        for (String oso : animales.keySet()) {
            if (animales.get(oso) instanceof Oso o) {
                osoCambiar.add(oso);
            }
        }
        
        animales.get(osoCambiar.get(osoCambiar.size() - 1)).setNombre("oso4");  
    }
}
