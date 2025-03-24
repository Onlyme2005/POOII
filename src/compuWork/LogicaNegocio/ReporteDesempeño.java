
package compuWork.LogicaNegocio;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReporteDesempeño {
    private double productividad;
    private double puntualidad;
    private double calidadTrabajo;
    private LocalDate fechaEvaluacion;
    private Empleado empleadito;

    public ReporteDesempeño(double productividad, double puntualidad, double calidadTrabajo) {
        this.productividad = productividad;
        this.puntualidad = puntualidad;
        this.calidadTrabajo = calidadTrabajo;
        this.fechaEvaluacion = LocalDate.now(); // Fecha actual
    }

    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }

    public double getPuntualidad() {
        return puntualidad;
    }

    public void setPuntualidad(double puntualidad) {
        this.puntualidad = puntualidad;
    }

    public double getCalidadTrabajo() {
        return calidadTrabajo;
    }

    public void setCalidadTrabajo(double calidadTrabajo) {
        this.calidadTrabajo = calidadTrabajo;
    }

    public LocalDate getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(LocalDate fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public Empleado getEmpleadito() {
        return empleadito;
    }

    public void setEmpleadito(Empleado empleadito) {
        this.empleadito = empleadito;
    }
    
     public static void generarReporteIndividual( Empleado empleadito, double productividad, double puntualidad, double calidadTrabajo, LocalDate fechaEvaluacion ) {
        System.out.println("~Reporte de Desempeño Individual~" +fechaEvaluacion);
        System.out.println("Empleado: " + empleadito.getNombre());
        System.out.println("Puesto: " + empleadito.getPuesto());
        System.out.println("Productividad: " + productividad + "%");
        System.out.println("Puntualidad: " + puntualidad+ "%");
        System.out.println("Calidad del Trabajo: " + calidadTrabajo + "%");
      }
      
    // Generar un reporte para un departamento
    public static void generarReporteDepartamento(String departamentito, ArrayList<Empleado> empleados,String evaluacion) {
        System.out.println("~Reporte de Desempeño del Departamento: " + departamentito + "~");
        
        double totalProductividad = 0;
        double totalPuntualidad = 0;
        double totalCalidad = 0;
        
        int cantidadEmpleados = empleados.size();
        System.out.println("Número de empleados: " + cantidadEmpleados);
        System.out.println("Promedio Productividad: " + (totalProductividad / cantidadEmpleados) + "%");
        System.out.println("Promedio Puntualidad: " + (totalPuntualidad / cantidadEmpleados) + "%");
        System.out.println("Promedio Calidad del Trabajo: " + (totalCalidad / cantidadEmpleados) + "%");
    }
    
}
