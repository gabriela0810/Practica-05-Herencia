/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author jenni
 */
public class Guitarra extends Instrumentos{
     public int numeroCuerdasw; 

    public Guitarra(int numeroCuerdasw, String modelow, int yearw, String fabricantew) {
        super(modelow, yearw, fabricantew);
        this.numeroCuerdasw = numeroCuerdasw;
    }

    
    
    public String afinarCuerdas(){
        return "Cuerdas afinadas!!!";
    }
    
}
