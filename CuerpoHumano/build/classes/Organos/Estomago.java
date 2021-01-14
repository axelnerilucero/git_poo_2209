/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organos;

/**
 *
 * @author VICTOR
 */
public class Estomago {
    private String tamanio;
    private String funcion;
    private float capacidad;

    public Estomago() {
    }

    public Estomago(String tamanio, String funcion, float capacidad) {
        this.tamanio = tamanio;
        this.funcion = funcion;
        this.capacidad = capacidad;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    public void metabolizar(){
        System.out.println("Metabolizando jeje");
    }
    public void disolver(){
        System.out.println("Disolvido jeje");
    }

    @Override
    public String toString() {
        String resultado="Capacidad: "+this.capacidad;
        resultado=resultado+"\n Funcion: "+this.funcion;
        resultado=resultado+"\n Tamanio: "+this.tamanio;
        return resultado;
    }
    
}
