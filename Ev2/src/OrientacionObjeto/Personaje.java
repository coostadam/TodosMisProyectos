/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacionObjeto;

/**
 *
 * @author dev
 */
public abstract class Personaje {
    String codigo;
    String nombre;
    int puntosVidas;
    int puntosExperiencia;
    boolean muerto;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVidas() {
        return puntosVidas;
    }

    public void setPuntosVidas(int puntosVidas) {
        this.puntosVidas = puntosVidas;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }

    public boolean isMuerto() {
        return muerto;
    }
  
    public void esMuerto(){
        if (this.puntosVidas < 0) {
            this.muerto = true;
        }else{
            this.muerto = false;
        }
    }
    
    public int herir(int herida){
        return this.puntosVidas -= herida;
    }
    
    public abstract void pocimaSanadora();
}
