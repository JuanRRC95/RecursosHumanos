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
public class Persona {

    private String nombre;

    private String apellido;

    private int edad;

    private double cedula;

    private double sueldo;

    public Persona(String nombre, String apellido, int edad, double cedula, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    //String nombre, String apellido, int edad, double cedula, double sueldo
    @Override
    public String toString() {
        return "Datos encontrados : \n"
                + "Nombre: " + nombre + "\n"
                + "Apellido :" + apellido + "\n"
                + "Edad :" + edad + "\n"
                + "Cedula :" + cedula + "\n"
                + "Sueldo :" + sueldo + "\n";
    }

}
