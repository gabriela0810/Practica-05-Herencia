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
public class Trompeta extends Instrumentos{
     public String materialFabricacionw;

    public Trompeta(String materialFabricacionw, String modelow, int yearw, String fabricantew) {
        super(modelow, yearw, fabricantew);
        this.materialFabricacionw = materialFabricacionw;
    }
    
    public String soplarTrompeta(){
        return "Tocando la Trompeta";
    }
}
