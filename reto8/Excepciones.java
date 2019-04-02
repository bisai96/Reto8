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
public class Excepciones {
    public double ladoA;
    public double ladoB;
    public boolean esValido;
    
    public double CalculaHipotenusa(double a, double b) throws IOException{
        System.out.println("Indique el valor de a y b");
        return Math.sqrt((a*a) + (b*b));
    }
    
    private boolean validaDatos(double a, double b) throws NumberFormatException{
       // if(a > 0 && > 0)
            return true;
    }
}
