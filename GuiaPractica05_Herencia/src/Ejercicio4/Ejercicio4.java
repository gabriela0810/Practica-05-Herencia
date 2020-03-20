/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author jenni
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        ArrayList<Pedidos> myPedidosw=new ArrayList<>();
        ArrayList<Pedidos> myPedidosw1=new ArrayList<>();
        ArrayList<Pedidos> myPedidosw2=new ArrayList<>();
        
        Proveedor myprovee=new Proveedor("Juan Perez", "San Salvador");
        
        CategVideoJuegos catg=new CategVideoJuegos("Video Juegos");
        CategElectronica catg1=new CategElectronica("Electronica");
        CategMuebles catg2=new CategMuebles("Muebles");
        
        myPedidosw.add(new Pedidos("Switch", 499.00, myprovee));
        myPedidosw.add(new Pedidos("Pokemon: Espada", 59.99, myprovee));
        myPedidosw.add(new Pedidos("Mando Controlador", 65.00, myprovee));
        
        myPedidosw1.add(new Pedidos("Microondas", 97.00, myprovee));
        myPedidosw1.add(new Pedidos("Dispensador de agua", 129.00, myprovee));
        myPedidosw1.add(new Pedidos("Licuadora", 37.00, myprovee));
        
        myPedidosw2.add(new Pedidos("Juego de sala", 847.00, myprovee));
        myPedidosw2.add(new Pedidos("Juego de comedor", 697.00, myprovee));
        myPedidosw2.add(new Pedidos("Ropero", 199.00, myprovee));
        
        double ttvj=0;
        double ttmuebles=0;
        double ttelctri=0;
        
        for(int i=0; i<myPedidosw.size(); i++){
            ttvj+=myPedidosw.get(i).preciow;
            System.out.println(myPedidosw.get(i).productow);
            System.out.println(myPedidosw.get(i).preciow);
            System.out.println(myPedidosw.get(i).proveew.nombrew);
                        
        }
        System.out.println("Total a pagar por el decuento de Video Juegos: $" + catg.aplicaDesc(ttvj) + "\n");
        
        for(int i=0; i<myPedidosw1.size(); i++){
            ttelctri+=myPedidosw1.get(i).preciow;
            System.out.println(myPedidosw1.get(i).productow);
            System.out.println(myPedidosw1.get(i).preciow);
            System.out.println(myPedidosw1.get(i).proveew.nombrew);
                        
        }
        System.out.println("Total a pagar por el decuento de Electrodomesticos: $" + catg1.aplicaDesc(ttelctri) + "\n");
        
        for(int i=0; i<myPedidosw2.size(); i++){
            ttmuebles+=myPedidosw2.get(i).preciow;
            System.out.println(myPedidosw2.get(i).productow);
            System.out.println(myPedidosw2.get(i).preciow);
            System.out.println(myPedidosw2.get(i).proveew.nombrew);
                        
        }
        System.out.println("Total a pagar por el decuento de Muebles: $" + catg2.aplicaDesc(ttmuebles) + "\n");
        
    }
}
