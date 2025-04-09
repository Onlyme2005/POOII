
package compuWork.LogicaNegocio;

import java.util.ArrayList;



public class Departamento {
    private String nombreDepto;
    private int idDepto;
    private String descripcion;
     

    private final  ArrayList<Empleado> registroEmpleados = new ArrayList<>();

    public Departamento(String nombreDepto, int idDepto, String descripcion) {
        this.nombreDepto = nombreDepto;
        this.idDepto = idDepto;
        this.descripcion = descripcion;
        
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

    public void setIdDepto(String idDepto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}