/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;
import Clases.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Rodriguez
 */
public class Logica {

    private List<Administrador> listaAdmin = new ArrayList<>();
    private List<Operario> listaOperario = new ArrayList<>();
    private List<Ejecutivo> listaEjecutivo = new ArrayList<>();

    public List<Administrador> getListaAdmin() {
        return listaAdmin;
    }

    public void setListaAdmin(List<Administrador> listaAdmin) {
        this.listaAdmin = listaAdmin;
    }

    public List<Operario> getListaOperario() {
        return listaOperario;
    }

    public void setListaOperario(List<Operario> listaOperario) {
        this.listaOperario = listaOperario;
    }

    public List<Ejecutivo> getListaEjecutivo() {
        return listaEjecutivo;
    }

    public void setListaEjecutivo(List<Ejecutivo> listaEjecutivo) {
        this.listaEjecutivo = listaEjecutivo;
    }

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

    public Logica() {

    }

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
            agregarOperario(operario);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }

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
            Administrador admin = new Administrador(nombre, apellido, edad, cedula, sueldo, nombreSector, NumeroPersonal);
            agregarAdministrador(admin);
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
            Ejecutivo ejecutivo = new Ejecutivo(nombre, apellido, edad, cedula, sueldo, nombreCargo);
            agregarEjecutivo(ejecutivo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }

    public void agregarOperario(Operario oper) {
        listaOperario.add(oper);
    }

    public void agregarAdministrador(Administrador admin) {
        listaAdmin.add(admin);
    }

    public void agregarEjecutivo(Ejecutivo ejecutivo) {
        listaEjecutivo.add(ejecutivo);
    }

    public void eliminarRegistroOperario() {
        String ced = JOptionPane.showInputDialog("Digite la cedula del empleado");
        double cedula = Double.parseDouble(ced);
        for (Operario oper : listaOperario) {
            if (cedula == oper.getCedula()) {
                listaOperario.remove(oper);
            } else {
                JOptionPane.showMessageDialog(null, "El registro no exite", "Error", 0);
            }
        }
    }

    public void eliminarRegistroAdministrador() {
        String ced = JOptionPane.showInputDialog("Digite la cedula del empleado");
        double cedula = Double.parseDouble(ced);
        for (Administrador admin : listaAdmin) {
            if (cedula == admin.getCedula()) {
                listaAdmin.remove(admin);
            } else {
                JOptionPane.showMessageDialog(null, "El registro no exite", "Error", 0);
            }
        }
    }

    public void eliminarRegistroEjecutivo() {
        String ced = JOptionPane.showInputDialog("Digite la cedula del empleado");
        double cedula = Double.parseDouble(ced);
        for (Ejecutivo ejec : listaEjecutivo) {
            if (cedula == ejec.getCedula()) {
                listaEjecutivo.remove(ejec);
            } else {
                JOptionPane.showMessageDialog(null, "El registro no exite", "Error", 0);
            }
        }
    }

    public void buscarRegistro(){
        String ced = JOptionPane.showInputDialog("Digite la cedula del empleado");
        double cedula = Double.parseDouble(ced);
        JOptionPane.showMessageDialog(null,buscarRegistro(cedula));
    }
    
    
    public String buscarRegistro(double cedula) {
        for (Administrador admin : listaAdmin) {
            if (cedula == admin.getCedula()) {
                return admin.toString();
            }
        }
        for (Operario oper : listaOperario) {
            if (cedula == oper.getCedula()) {
                return oper.toString();
            }
        }
        for (Ejecutivo ejec : listaEjecutivo) {
            if (cedula == ejec.getCedula()) {
                return ejec.toString();
            }
        }
        return "El registro no existe";
    }

}
