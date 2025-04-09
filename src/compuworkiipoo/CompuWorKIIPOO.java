/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compuworkiipoo;

import compuWork.CapaPresentacion.IniciarSesion;
import compuWork.CapaPresentacion.Modelo;
import compuWork.LogicaNegocio.AdministradorCW;
import compuWork.LogicaNegocio.GestionEmpresa;

/**
 *
 * @author Brislleily S.Carmona
 */
public class CompuWorKIIPOO {

      public static void main(String[] args) {
        GestionEmpresa gestion=new GestionEmpresa("COMPUWORK");
        
        AdministradorCW admin = new AdministradorCW ("Star","Bris05", "2005") {};
        gestion.setAdmin(admin);
        
        Modelo ventana= new Modelo(gestion);
        //ventana.setVisible(true);
        IniciarSesion sesion = new IniciarSesion(ventana,true,gestion,ventana);
        sesion.setVisible(true);
      }
}
