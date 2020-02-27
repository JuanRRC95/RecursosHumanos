/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;
import Clases.*;

/**
 *
 * @author Juan Rodriguez
 */
public class Logica {
    
    private String[] cargos = {
        "Bonchador",
        "Clasificacion",
        "Cuarto Frio",
        "Cultivo"
    };
    
    private String[] sectores = {
        "Sector 1",
        "Sector 2",
        "Sector 3",
        "Sector 4"
    };
    
    private String[] cargosEjecutivos = {
        "Jefe RecursosHumanos",
        "Jefe Contabilidad",
        "Jefe Produccion"
        
    };
    public Logica(){
        
    }
    
    /**
     * (String nombre, String apellido, int edad, double cedula, double sueldo,String cargoOperario,int horasSemana) {
        super(nombre, apellido, edad, cedula, sueldo);
        this.cargoOperario=cargoOperario;
        this.horasSemana=horasSemana;
    }
     */
    
    
    public void insertarOperario() {
        try {
            String nombre = JOptionPane.showInputDialog("Digite el nombre del operario");
            String apellido = JOptionPane.showInputDialog("Digite el apellido del operario");
            String ed = JOptionPane.showInputDialog("Digite la edad del operario");
            int edad = Integer.parseInt(ed);
            String ced = JOptionPane.showInputDialog("Digite la cedula del operario");
            double cedula = Double.parseDouble(ced);
            String suel = JOptionPane.showInputDialog("Digite el sueldo del operario");
            double sueldo = Double.parseDouble(suel);
            String nombreCargo = (String) JOptionPane.showInputDialog(null, "Seleccione una cargo", "Cargos", JOptionPane.DEFAULT_OPTION, null, cargos, cargos[0]);
            String horas = JOptionPane.showInputDialog("Digite la intensidad horario");
            int hsemanales = Integer.parseInt(horas);
            Operario operario = new Operario(nombre, apellido, edad, cedula, sueldo, nombreCargo, hsemanales);
            //agregarBus(bus);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }
    
    /**
     * this.idSectorAdministrado=idSectorAdministrado;
        this.nombreSectorAdministrado=nombreSectorAdministrado;
        this.personalACargo=personalACargo;
     */
    
    public void insertarAdministrador() {
        try {
            String nombre = JOptionPane.showInputDialog("Digite el nombre del operario");
            String apellido = JOptionPane.showInputDialog("Digite el apellido del operario");
            String ed = JOptionPane.showInputDialog("Digite la edad del operario");
            int edad = Integer.parseInt(ed);
            String ced = JOptionPane.showInputDialog("Digite la cedula del operario");
            double cedula = Double.parseDouble(ced);
            String suel = JOptionPane.showInputDialog("Digite el sueldo del operario");
            double sueldo = Double.parseDouble(suel);
            String nombreSector = (String) JOptionPane.showInputDialog(null, "Seleccione un Sector", "sectores", JOptionPane.DEFAULT_OPTION, null, sectores, sectores[0]);
            String nPersonal = JOptionPane.showInputDialog("Digite el numero de personas a su cargo");
            int NumeroPersonal = Integer.parseInt(nPersonal);
            Administrador admin = new Administrador(nombre, apellido, edad, cedula, sueldo,nombreSector,NumeroPersonal);
            //agregarBus(bus);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }
    
    public void insertarEjecutivo() {
        try {
            String nombre = JOptionPane.showInputDialog("Digite el nombre del operario");
            String apellido = JOptionPane.showInputDialog("Digite el apellido del operario");
            String ed = JOptionPane.showInputDialog("Digite la edad del operario");
            int edad = Integer.parseInt(ed);
            String ced = JOptionPane.showInputDialog("Digite la cedula del operario");
            double cedula = Double.parseDouble(ced);
            String suel = JOptionPane.showInputDialog("Digite el sueldo del operario");
            double sueldo = Double.parseDouble(suel);
            String nombreCargo = (String) JOptionPane.showInputDialog(null, "Seleccione un cargo", "Cargos", JOptionPane.DEFAULT_OPTION, null, cargosEjecutivos, cargosEjecutivos[0]);
            Ejecutivo ejecutivo = new Ejecutivo(nombre, apellido, edad, cedula, sueldo,nombreCargo);
            //agregarBus(bus);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }
    
    public void agregarOperario(){
        
    }
    
    public void agregarAdministrador(){
        
    }
    
    public void agregarEjecutivo(){
        
    }
    
}
