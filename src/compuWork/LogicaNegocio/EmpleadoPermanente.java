
package compuWork.LogicaNegocio;

import java.util.List;


public class EmpleadoPermanente extends Empleado{
    private double sueldoAsignado;
    private String seguroVida;

    public EmpleadoPermanente(double sueldoAsignado, String seguroVida, String nombre, int idEmp, String correo, int telefono, String puesto, double salario, String contrato, List<ReporteDesempeño> reportes) {
        super(nombre, idEmp, correo, telefono, puesto, salario, contrato, reportes);
        this.sueldoAsignado = sueldoAsignado;
        this.seguroVida = seguroVida;
    }

    public double getSueldo() {
        return sueldoAsignado;
    }

    public void setSueldo(double sueldo) {
        this.sueldoAsignado = sueldo;
    }

    public String getSeguroVida() {
        return seguroVida;
    }

    public void setSeguroVida(String seguroVida) {
        this.seguroVida = seguroVida;
    }
    
   public boolean aceptarContratoPermanente(String contrato) {
    return contrato != null && contrato.length() > 0;
}
    } 
    
   
