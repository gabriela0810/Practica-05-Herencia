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
public class Empresa {
    public String nombrEmpresaw;
    public String rubroEmpresaw;
    public String localizacionEmpw;
    public int yearFundacionw;
    public int numEmpleadosw;

    public Empresa() {
    }
    public Empresa(String nombrEmpresaw, String rubroEmpresaw, String localizacionEmpw, int yearFundacionw, int numEmpleadosw) {
        this.nombrEmpresaw = nombrEmpresaw;
        this.rubroEmpresaw = rubroEmpresaw;
        this.localizacionEmpw = localizacionEmpw;
        this.yearFundacionw = yearFundacionw;
        this.numEmpleadosw = numEmpleadosw;
    }
    
    public String infoEmpresa(){
        String info=this.nombrEmpresaw + "\n" + this.rubroEmpresaw + "\n" +
                    this.localizacionEmpw + "\n" + this.yearFundacionw + "\n" +
                    this.numEmpleadosw + "\n";
        return info;
    }
    
    public String recibirPedidos(){
        return "Pedidos recibidos";
    }
    
    public String enviarPedidos(){
        return "Pedidos enviados";
    }
    
}
