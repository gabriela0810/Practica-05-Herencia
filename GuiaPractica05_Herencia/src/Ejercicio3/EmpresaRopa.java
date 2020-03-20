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
public class EmpresaRopa extends Empresa{
    public String tiposPrendaw;
    public int numPrendasw;

    public EmpresaRopa(String tiposPrendaw, int numPrendasw, String nombrEmpresaw, String rubroEmpresaw, String localizacionEmpw, int yearFundacionw, int numEmpleadosw) {
        super(nombrEmpresaw, rubroEmpresaw, localizacionEmpw, yearFundacionw, numEmpleadosw);
        this.tiposPrendaw = tiposPrendaw;
        this.numPrendasw = numPrendasw;
    }

    @Override
    public String infoEmpresa() {
        String info=this.tiposPrendaw + "\n" + this.numPrendasw + "\n";
        return info+super.infoEmpresa(); 
    }
 
    public String crearPrenda(){
        return "Prenda creada: " + this.tiposPrendaw;
    }
    
}
