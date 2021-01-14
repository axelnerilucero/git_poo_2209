/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuerpohumano;

import Organos.Estomago;

/**
 *
 * @author VICTOR
 */
public class CuerpoHumano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estomago stomach= new Estomago("Grande", "contener", (float) 13.4);
       System.out.println(stomach);
    }
}
