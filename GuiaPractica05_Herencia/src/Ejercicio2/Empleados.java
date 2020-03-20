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
public class Empleados {
    public String nombrew;
    public String direccionw;
    public String puestow;
    public int telefonow;
    public double sueldow;
    public Gerente gerentew;

    public Empleados() {
    }
    public Empleados(String nombre, String direccion, String puesto, int telefono, double sueldo) {
        this.nombrew = nombre;
        this.direccionw = direccion;
        this.puestow = puesto;
        this.telefonow = telefono;
        this.sueldow = sueldo;
    }
    public Empleados(String nombrew, String direccionw, String puestow, int telefonow, double sueldow, Gerente gerentew) {
        this.nombrew = nombrew;
        this.direccionw = direccionw;
        this.puestow = puestow;
        this.telefonow = telefonow;
        this.sueldow = sueldow;
        this.gerentew = gerentew;
    }
    
    public String info(){
        return "Estas a las ordenes del " + this.gerentew.puestow + " " + this.gerentew.nombrew + "\n" + infoEmpleado();
    }
    
    public String infoEmpleado(){
        String info=this.nombrew + "\n" + this.direccionw + "\n" +
                    this.puestow + "\n" + this.telefonow + "\n" + 
                    this.sueldow;
        return info;
    }
    
    public String estadoEmpl(){
        return "Trabajando";
    }
    
    
}
