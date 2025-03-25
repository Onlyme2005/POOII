
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
    
    //GENERAR REPORTE A NIVEL EMPLEADO
    public static void generarReporteIndividual(Empleado empleadito, double productividad, double puntualidad, double calidadTrabajo) {
        try {
            if (empleadito == null) {
                throw new IllegalArgumentException("El empleado no puede ser nulo.");
            }
            if (productividad < 0 || puntualidad < 0 || calidadTrabajo < 0) {
                throw new IllegalArgumentException("Los valores de productividad, puntualidad y calidad no pueden ser negativos.");
            }
            System.out.println("~Reporte de Desempeño Individual~" + LocalDate.now());
            System.out.println("Empleado: " + empleadito.getNombre());
            System.out.println("Puesto: " + empleadito.getPuesto());
            System.out.println("Productividad: " + productividad + "%");
            System.out.println("Puntualidad: " + puntualidad + "%");
            System.out.println("Calidad del Trabajo: " + calidadTrabajo + "%");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al generar reporte individual: " + e.getMessage());
        }
    }
    
    // GENEREAR REPORTE DESEMPEÑO A NIVEL DEPARTAMENTAL
    public static void generarReporteDepartamento(String departamentito, ArrayList<Empleado> empleados) {
        try {
            if (empleados == null || empleados.isEmpty()) {
                throw new IllegalArgumentException("El departamento no tiene empleados para evaluar.");
            }
            System.out.println("~Reporte de Desempeño del Departamento: " + departamentito + "~");
            
            double totalProductividad = 0;
            double totalPuntualidad = 0;
            double totalCalidad = 0;
            
            int cantidadEmpleados = empleados.size();
            for (Empleado e : empleados) {
                for (ReporteDesempeño r : e.getReportes()) {
                    totalProductividad += r.getProductividad();
                    totalPuntualidad += r.getPuntualidad();
                    totalCalidad += r.getCalidadTrabajo();
                }
            }
            
            System.out.println("Número de empleados: " + cantidadEmpleados);
            System.out.println("Promedio Productividad: " + (totalProductividad / cantidadEmpleados) + "%");
            System.out.println("Promedio Puntualidad: " + (totalPuntualidad / cantidadEmpleados) + "%");
            System.out.println("Promedio Calidad del Trabajo: " + (totalCalidad / cantidadEmpleados) + "%");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al generar reporte del departamento: " + e.getMessage());
        }
    }
}
