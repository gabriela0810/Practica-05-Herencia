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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("GUITARRA");
        Guitarra myguit=new Guitarra(4, "Les Paul", 1960, "Gibson");
        System.out.println(myguit.fabricantew);
        System.out.println(myguit.yearw);
        System.out.println(myguit.modelow);
        System.out.println(myguit.numeroCuerdasw);
        System.out.println(myguit.sonidoInstrum());
        System.out.println(myguit.afinarCuerdas());
        
        System.out.println("_____________________________________________________________________________\n");
        
        System.out.println("\nPIANO");
        Piano mypian=new Piano("Electronico", "Clavinova", 2000, "Yamaha");
        System.out.println(mypian.fabricantew);
        System.out.println(mypian.modelow);
        System.out.println(mypian.yearw);
        System.out.println(mypian.tipoPianow);
        System.out.println(mypian.tocarMelodia());
        
         System.out.println("_____________________________________________________________________________\n");
        
        System.out.println("\nTROMPETA");
        Trompeta mytromp=new Trompeta("Cobre", "YTR-6330F", 1990, "Professional Bb trumpets");
        System.out.println(mytromp.fabricantew);
        System.out.println(mytromp.modelow);
        System.out.println(mytromp.yearw);
        System.out.println(mytromp.materialFabricacionw);
        System.out.println(mytromp.soplarTrompeta());
        System.out.println(mytromp.sonidoInstrum());
    }
    
}
