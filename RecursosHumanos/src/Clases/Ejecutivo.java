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
public class Ejecutivo extends Persona {
    
    private String nombreCargoEjecutivo;

    public Ejecutivo(String nombre, String apellido, int edad, double cedula, double sueldo,String nombreCargoEjecutivo) {
        super(nombre, apellido, edad, cedula, sueldo);
        this.nombreCargoEjecutivo=nombreCargoEjecutivo;
    }

    public String getNombreCargoEjecutivo() {
        return nombreCargoEjecutivo;
    }

    public void setNombreCargoEjecutivo(String nombreCargoEjecutivo) {
        this.nombreCargoEjecutivo = nombreCargoEjecutivo;
    }

    @Override
    public String toString() {
        return super.toString()+"Nombre del Cargo: " + nombreCargoEjecutivo + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
    
}
