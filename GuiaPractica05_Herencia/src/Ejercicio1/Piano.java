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
public class Piano extends Instrumentos{
    public String tipoPianow;

    public Piano(String tipoPianow, String modelow, int yearw, String fabricantew) {
        super(modelow, yearw, fabricantew);
        this.tipoPianow = tipoPianow;
    }
    
    public String tocarMelodia(){
        return "♫ ♪ ♫ ♪";
    }
}
