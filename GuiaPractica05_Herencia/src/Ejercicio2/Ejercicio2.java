/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author jenni
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("PRESIDENTE");
        Presidente mypresid=new Presidente("Pan Sinaí", 1650, "Maria Lemus", "San Salvador", "Presidente", 78906543, 986.55);
        System.out.println(mypresid.infoEmpleado());
        System.out.println(mypresid.realizaPagos());
        
        System.out.println("_____________________________________________________________________________\n");
        
        System.out.println("GERENTES");
        System.out.println("GERENTE N°1");
        Gerente gerente1=new Gerente("Ventas", 900.76, mypresid, "Jose Mario", "Santa Ana", "Gerente", 77654321, 750.00);
        System.out.println(gerente1.infoEmpleado());
        System.out.println(gerente1.adminis());
        
        System.out.println("\nGERENTE N°2");
        Gerente gerente2=new Gerente("Almacen", 900.76, mypresid, "Juan Perez", "Usulutan", "Gerente", 76453078, 750.00);
        System.out.println(gerente2.infoEmpleado());
        System.out.println(gerente2.adminis());
        
        
        System.out.println("_____________________________________________________________________________\n");
        
        System.out.println("EMPLEADOS");
        Empleados emple1=new Empleados("Steven Membreño", "El congo", "Repartidor", 70086545, 450.25, gerente1);
        System.out.println(emple1.info());
        System.out.println(emple1.estadoEmpl()+"\n");
        
        Empleados emple2=new Empleados("Krissia Preza", "Metapan", "Vendedora", 72341240, 450.25, gerente1);
        System.out.println(emple2.info());
        System.out.println(emple2.estadoEmpl()+"\n");
        
        Empleados emple3=new Empleados("Mario Lopez", "Santa Ana", "Vendedor", 72007128, 450.25, gerente1);
        System.out.println(emple3.info());
        System.out.println(emple3.estadoEmpl()+"\n");
        
        Empleados emple4=new Empleados("Oscar Barrientos", "San Vicente", "Repartidor", 79895437, 450.25, gerente2);
        System.out.println(emple4.info());
        System.out.println(emple4.estadoEmpl()+"\n");
        
        Empleados empl5=new Empleados("Dennis Olmedo", "La Union", "Repartidor", 76675433, 450.25, gerente2);
        System.out.println(empl5.info());
        System.out.println(empl5.estadoEmpl()+"\n");
        
        Empleados emple6=new Empleados("Alexander Roque", "San Vicente", "Vendedor", 78654433, 450.25, gerente2);
        System.out.println(emple6.info());
        System.out.println(emple6.estadoEmpl()+"\n");
        
    }
  
}
