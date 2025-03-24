
package compuWork.LogicaNegocio;

import java.util.List;


public class EmpleadoTemporal extends Empleado{
    private int duracionContrato;
    private double tarifaHora;

    public EmpleadoTemporal(int duracionContrato, double tarifaHora, String nombre, int idEmp, String correo, int telefono, String puesto, double salario, String contrato,List<ReporteDesempeño> reportes) {
        super(nombre, idEmp, correo, telefono, puesto, salario, contrato, reportes);
        this.duracionContrato = duracionContrato;
        this.tarifaHora = tarifaHora;
    }


    public int getDuracionContrato() {
        return duracionContrato;
    }

    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
  public boolean aceptarContratoTemporal(String contrato) {
    return contrato != null && contrato.length() > 0;
    }
}