
package compuWork.LogicaNegocio;

import java.util.ArrayList;
import java.util.List;


public class Departamento {
    private String nombreDepto;
    private int idDepto;
    private String descripcion;
    private List<ReporteDesempeño> reportes; 

    private final  ArrayList<Empleado> registroEmpleados = new ArrayList<>();

    public Departamento(String nombreDepto, int idDepto, String descripcion, List<ReporteDesempeño> reportes) {
        this.nombreDepto = nombreDepto;
        this.idDepto = idDepto;
        this.descripcion = descripcion;
        this.reportes = reportes;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    public int getIdDepto() {
        return idDepto;
    }

    public void setId(int idDepto) {
        this.idDepto= idDepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Empleado> getRegistroEmpleados() {
        return registroEmpleados;
    }

    public List<ReporteDesempeño> getReportes() {
        return reportes;
    }
    

    //METODO PARA VISUALIZAR Y AGREGAR EMPLEADOS EN DEPARTAMENTO
    
    public String visulizarEmpleados(){
        String empleado =" ";
        for (int i = 0; i < this.registroEmpleados.size(); i++) {
            Empleado e=this.registroEmpleados.get(i);
            empleado+=e.toString()+"\n";
        }
        return empleado;
      
    }
   
    public boolean asignarEmpleado(Empleado empleadito) {
        if (empleadito == null) {
            throw new IllegalArgumentException("Error, no puede ingresar un valor nulo.");
        }
        if (registroEmpleados.contains(empleadito)) {
            return false; 
        }
        registroEmpleados.add(empleadito);
        return true;
}
    @Override
    public String toString (){
        return
                "Empleado: " +nombreDepto+ "\n"+
                "Codigo Departamento: " +idDepto+ "\n"+
                "Descripcion: " +descripcion+ "\n";
                
 
    }
}