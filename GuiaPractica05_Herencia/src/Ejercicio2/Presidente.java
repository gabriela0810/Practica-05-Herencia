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
public class Presidente extends Empleados{
    public String empresaw;
    public double Presidentew;

    public Presidente(String empresa, double comiPresidente, String nombre, String direccion, String puesto, int telefono, double sueldo) {
        super(nombre, direccion, puesto, telefono, sueldo);
        this.empresaw = empresa;
        this.Presidentew = comiPresidente;
    }

    @Override
    public String infoEmpleado() {
        String info=this.empresaw + "\n" + this.Presidentew + "\n";
        return info+super.infoEmpleado();
    }
    
    public String realizaPagos(){
        return "Pago a sus empleados";
    }
    
}
