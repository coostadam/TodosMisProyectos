/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author dev
 */
public class MiNumero {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws TooHighNumberException {
        if (numero > 100) {
            throw new TooHighNumberException("Numero demasiado alto");
        }else{
            this.numero = numero;
        }

    }
    
}
