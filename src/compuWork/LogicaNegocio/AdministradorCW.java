/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuWork.LogicaNegocio;

/**
 *
 * @author Brislleily S.Carmona
 */


public abstract class AdministradorCW {
        private String nombre;
        private String userName;
        private String password;

    public AdministradorCW(String nombre, String userName, String password) {
        this.nombre = nombre;
        this.userName = userName;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
    }
    
