/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author jenni
 */
public class CategVideoJuegos extends Categorias{
    public double descuentow;

    public CategVideoJuegos(String categw) {
        super(categw);
        this.descuentow = 0.08;
    }
    
    public double aplicaDesc(double descw){
        double descuentw=descw-(descw*this.descuentow);
        return descuentw;
    }
}
