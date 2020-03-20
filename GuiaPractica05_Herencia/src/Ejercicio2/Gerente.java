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
public class Gerente extends Empleados{
    public String puestoGerenciaw;
    public double Gerentew;
    public Presidente presidentew;

    public Gerente(String puestoGerenciaw, double Gerentew, Presidente presidentew, String nombrew, String direccionw, String puestow, int telefonow, double sueldow) {
        super(nombrew, direccionw, puestow, telefonow, sueldow);
        this.puestoGerenciaw = puestoGerenciaw;
        this.Gerentew = Gerentew;
        this.presidentew = presidentew;
    }

    @Override
    public String infoEmpleado() {
        String info="Estan al servicio de " + this.presidentew.nombrew + " Presidente de la empresa " + this.presidentew.empresaw + 
                    "\n" + this.Gerentew + "\n";
        return info+super.infoEmpleado();
    }

    
    
    public String adminis(){
        return "Gerente especial del departamento de " + this.puestoGerenciaw;
    }
    
}
