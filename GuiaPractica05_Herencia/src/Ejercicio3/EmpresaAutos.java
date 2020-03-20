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
public class EmpresaAutos extends Empresa{
    public String tipoChasisw;
    public String tipoCarroceriaw;
    public String tipoMotorw;
    public int numPuertasw;

    public EmpresaAutos(String tipoChasisw, String tipoCarroceriaw, String tipoMotorw, int numPuertasw, String nombrEmpresaw, String rubroEmpresaw, String localizacionEmpw, int yearFundacionw, int numEmpleadosw) {
        super(nombrEmpresaw, rubroEmpresaw, localizacionEmpw, yearFundacionw, numEmpleadosw);
        this.tipoChasisw = tipoChasisw;
        this.tipoCarroceriaw = tipoCarroceriaw;
        this.tipoMotorw = tipoMotorw;
        this.numPuertasw = numPuertasw;
    }

    @Override
    public String infoEmpresa() {
        String info=this.tipoChasisw + "\n" + this.tipoCarroceriaw + "\n" + 
                    this.tipoMotorw + "\n" + this.numPuertasw + "\n";
        
        return info+super.infoEmpresa(); 
    }
    
    public String ensamblarAuto(){
        return "Auto ensamblado satisfactoriamente";
    }
    
}
