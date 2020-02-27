/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Juan Rodriguez
 */
public class Administrador extends Persona{
    
    private int idSectorAdministrado;
    
    private String nombreSectorAdministrado;
    
    private int personalACargo;

    public Administrador(String nombre, String apellido, int edad, double cedula, double sueldo,String nombreSectorAdministrado,int personalACargo) {
        super(nombre, apellido, edad, cedula, sueldo);       
        this.nombreSectorAdministrado=nombreSectorAdministrado;
        this.personalACargo=personalACargo;
    }

    public String getNombreSectorAdministrado() {
        return nombreSectorAdministrado;
    }

    public void setNombreSectorAdministrado(String nombreSectorAdministrado) {
        this.nombreSectorAdministrado = nombreSectorAdministrado;
    }

    public int getPersonalACargo() {
        return personalACargo;
    }

    public void setPersonalACargo(int personalACargo) {
        this.personalACargo = personalACargo;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Id Sector Administrado: " + idSectorAdministrado + "\n"+
                "Nombre Sector Administrado :" + nombreSectorAdministrado + "\n"+
                "Personal a Cargo: " + personalACargo + "\n"; 
    }
    
    
    
    
}
