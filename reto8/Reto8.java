/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto8;

import java.io.IOException;

/**
 *
 * @author bisai
 */
public class Reto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Excepciones valor = new Excepciones();
        System.out.println("Indique el valor de a y b");
       double recibe = valor.CalculaHipotenusa( 2.5, 5.5);
        System.out.println(recibe);
    }
    
}
