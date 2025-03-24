
package compuWork.LogicaNegocio;

import java.util.ArrayList;


public class GestionEmpresa {
    
    private final ArrayList<Empleado> registroEmpleados;
    private final ArrayList<Departamento> departamentos;

    public GestionEmpresa(ArrayList<Empleado> registroEmpleados) {
        this.departamentos = new ArrayList<>();
        this.registroEmpleados = new ArrayList<>(registroEmpleados); 
    }
    
    //Metodos CRUD
    
    //CREAR EMPLEADO
    public boolean crearEmpleado(Empleado empleadito) {
        return this.registroEmpleados.add(empleadito);
    }
    
    //BUSCAR EMPLEADO POR ID
    public Empleado buscarEmpleado(int idEmp){
        for (int i = 0; i < this.registroEmpleados.size(); i++) {
            Empleado e= this.registroEmpleados.get(i);
             if (e.getIdEmp()==idEmp){
                return e;
            }
        }
         return null;
    }
    
    // BUSCAR EMPLEADO POR NOMBRE       
    public Empleado buscarEmpleado(String nombre){
        for (int i = 0; i < this.registroEmpleados.size(); i++) {
            Empleado e= this.registroEmpleados.get(i);
            if (e.getNombre().equals(nombre)){
                return e;
            }
        }
             return null;
  }
    //ACTUALIZAR EMPLEADO
    public int buscarIdEmpleado(int idEmp){
        for (int i = 0; i < registroEmpleados.size(); i++) {
            Empleado e= this.registroEmpleados.get(i);
            if (e.getIdEmp()==idEmp){
            return i;
        }
    }
       return -1;
  }
    
    public Empleado actualizarEmpleado(int idEmp, Empleado empleadito){
        int index = buscarIdEmpleado(idEmp);
        if (index>0) {
            return this.registroEmpleados.set(index,empleadito);
        }else{
            return null;
        }
    }
    
    //ELIMINAR EMPLEADO
    public Empleado eliminarEmpleado (int idEmp){
        int index =buscarIdEmpleado(idEmp);
        if (index>0){
            return this.registroEmpleados.remove(index); 
        }
        return null;
    }
    
    //MOSTRAR EMPLEADOS
    public String mostrarEmpleados(){
        String empleado = "";
        for (int i = 0; i <this.registroEmpleados.size(); i++) {
            Empleado e=this.registroEmpleados.get(i);
            empleado += e.toString()+"\n";    
        }
    return empleado;
    }

    
//*METOODS CRUD DEPARTAMENTO*: 
    
    //AGREGAR DEPARTAMENTO
    public boolean agregarDepartamento(Departamento departamentito){
        return this.departamentos.add(departamentito);
    }
    
    //BUSCAR DEPARTAMENTO
    public Departamento buscarDepartamento(Departamento departamentito){
        for (int i = 0; i < this.departamentos.size(); i++) {
            Departamento d= this.departamentos.get(i);
            if (d.equals(departamentito)){
                return d;     
            }
            
        }
        return null;
    }
    
    //Sobrecarga de metodo
    public Departamento buscarDepartamento(int idDepto){
        for (int i = 0; i < this.departamentos.size(); i++) {
            Departamento d= this.departamentos.get(i);
            if (d.getIdDepto()==idDepto){
                return d;     
            }     
        }
        return null;
    }
    
//MODIFICAR EMPLEADOS
    public int buscarIndiceDepto(int idDepto){
        for (int i = 0; i < departamentos.size(); i++) {
            Departamento d=this.departamentos.get(i);
            if (d.getIdDepto()==idDepto){
            return i;  
        }
    } 
    return -1;
}  
//ACTUALIZAR DEPARTAMENTOS   
    public Departamento actualizarDepartamento(int idDepto,Departamento departamentito){
        int index=this.buscarIndiceDepto(idDepto);
        if(index>0){
            return this.departamentos.set(index, departamentito);
        }else{
            return null;
        }
    }
    
//ELIMINAR DEPARTAMENTO
    public Departamento eliminarDepartamento(int idDepto){
        int index= this.buscarIndiceDepto(idDepto);
        if (index>0){
            return this.departamentos.remove(index);   
        }else{
            
    }return null;
    
}
    
 // MOSTRAR DEPARTAMENTOS
    
    public String mostrarDepartamentos(){
        String departamentoList="";
        for (int i = 0; i < this.departamentos.size(); i++) {
            Departamento d=this.departamentos.get(i);
            departamentoList += d.toString()+ "\n"; 
        }
        return departamentoList;
    }
    
    //*METODO ADICIONAL*
    
    public boolean asignarEmpleadoADepto(int idEmp, int idDepto) {
        Empleado empleadito = buscarEmpleado(idEmp);
        Departamento departamentito = buscarDepartamento(idDepto);
       
        if (empleadito != null && departamentito != null) {
            return departamentito.asignarEmpleado(empleadito);
        }
        return false; 
    
    }

}


        

