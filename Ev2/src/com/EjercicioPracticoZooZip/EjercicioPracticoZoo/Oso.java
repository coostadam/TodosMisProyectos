/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPracticoZoo;

/**
 *
 * @author dariu
 */
public class Oso extends Animal {

    @Override
    public String toString() {
        return super.toString() + " --> Oso{" + "colorOjos=" + colorOjos + '}';
    }

    public Oso(String colorOjos, String codigo, String nombre, double peso, int hambre) {
        super(codigo, nombre, peso, hambre);
        this.colorOjos = colorOjos;
    }
    private String colorOjos;

    @Override
    public void darDeComer() {
        super.setHambre(super.getHambre() + 20);

    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

}
