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
public class Instrumentos {
    public String modelow;
    public int yearw;
    public String fabricantew;

    public Instrumentos() {
    }
    public Instrumentos(String modelow, int yearw, String fabricantew) {
        this.modelow = modelow;
        this.yearw = yearw;
        this.fabricantew = fabricantew;
    }
    
    public String sonidoInstrum(){
        String son="♫ ♪ ♫ ♪";
        return son;
    }
}
