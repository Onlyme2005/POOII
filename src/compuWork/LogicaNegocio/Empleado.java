
package compuWork.LogicaNegocio;

import java.util.List;


public class Empleado {
    private String nombre;
    private int idEmp;
    private String correo;
    private int telefono;
    private String puesto;
    private double salario;
    private String contrato;

     private List<ReporteDesempeño> reportes;

    public Empleado(String nombre, int idEmp, String correo, int telefono, String puesto, double salario, String contrato, List<ReporteDesempeño> reportes) {
        this.nombre = nombre;
        this.idEmp = idEmp;
        this.correo = correo;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario = salario;
        this.contrato = contrato;
        this.reportes = reportes;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setId(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String Contrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato; 
    }

    public String getContrato() {
        return contrato;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public List<ReporteDesempeño> getReportes() {
        return reportes;
    }

    public void setReportes(List<ReporteDesempeño> reportes) {
        this.reportes = reportes;
    }
    
    

   //METODO toString PARA MOSTRAR DATOS EMPLEADOS 
    @Override
    public String toString (){
        return
                "Empleado: " +nombre+ "\n"+
                "Identificación: " +idEmp+ "\n"+
                "E-mail: " +correo+ "\n"+
                "Telefono: " +telefono+ "\n"+
                "Puesto: " +puesto+ "\n"+
                "Salario: " +salario+ "\n";
    }
}     
    

        
