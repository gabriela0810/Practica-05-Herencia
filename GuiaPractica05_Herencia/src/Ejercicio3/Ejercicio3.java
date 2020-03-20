/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author jenni
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        EmpresaRopa ropaInc=new EmpresaRopa("Casuales", 34, "Liberty Urban", "Ropa", "El Salavdor", 2011, 75);
        System.out.println(ropaInc.infoEmpresa());
        System.out.println(ropaInc.recibirPedidos());
        System.out.println(ropaInc.enviarPedidos());
        System.out.println(ropaInc.crearPrenda());
        
        System.out.println("_____________________________________________________________________________\n");
        
        EmpresaAutos autoInc=new EmpresaAutos("Chasis Grande", "Carroceria de aluminio", "Motor turboalimentado de 1.5L", 2, "Honda Motor Co", "Autos", "Japon", 1948, 181876);
        System.out.println(autoInc.infoEmpresa());
        System.out.println(autoInc.recibirPedidos());
        System.out.println(autoInc.enviarPedidos());
        System.out.println(autoInc.ensamblarAuto());
        
        System.out.println("_____________________________________________________________________________\n");
        
        EmpresaPesca pescaInc=new EmpresaPesca("Comercial", "Grupo tres Mares", "Pesca", "Madrid", 2005, 150);
        System.out.println(pescaInc.infoEmpresa());
        System.out.println(pescaInc.recibirPedidos());
        System.out.println(pescaInc.enviarPedidos());
        System.out.println(pescaInc.pescar());
    }
}
