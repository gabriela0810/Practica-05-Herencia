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
public class EmpresaPesca extends Empresa{
    public String tipoPescaw;

    public EmpresaPesca(String tipoPescaw, String nombrEmpresaw, String rubroEmpresaw, String localizacionEmpw, int yearFundacionw, int numEmpleadosw) {
        super(nombrEmpresaw, rubroEmpresaw, localizacionEmpw, yearFundacionw, numEmpleadosw);
        this.tipoPescaw = tipoPescaw;
    }

    @Override
    public String infoEmpresa() {
        String info=this.tipoPescaw + "\n";
        return info+super.infoEmpresa(); 
    }
    
    public String pescar(){
        return "Barcos pescando";
    }
    
    
}
