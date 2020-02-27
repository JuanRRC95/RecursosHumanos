/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Rodriguez
 */
public class Menus {
    
    private Logica logica = new Logica();
    
    public Menus(){
        
    }
    
    
    public String graficoMenuInicial(){
        String opc = JOptionPane.showInputDialog(
                "  1. Crear Registros \n"
                + "2. Eliminar Registros \n"
                + "3. Imprimir registros \n"
                + "4. Consultar resgistro \n"
                + "0. Salir ");
        return opc;
    }
    
    public String graficoMenuInsercion(){
        String opc = JOptionPane.showInputDialog(
                  "1. Crear Operario \n"
                + "2. Crear Administrador \n"
                + "3. Crear Ejecutivo \n"
                + "0. Salir ");
        return opc;
    }
    
    public String graficoMenuEliminacion(){
        String opc = JOptionPane.showInputDialog(
                  "1. Eliminar Operario \n"
                + "2. Eliminar Administrador \n"
                + "3. Eliminar Ejecutivo \n"
                + "0. Salir ");
        return opc;
    }
    
    public void logicaMenuInicial(){
        boolean bandera = true;
        while (bandera){
            try {
                int op = Integer.parseInt(graficoMenuInicial());
                switch (op) {
                    case 1: logicaMenuInsercion();
                            break;
                    case 2: logicaMenuEliminacion();
                            break;
                   // case 3: ;
                   //         break;
                    case 4: logica.buscarRegistro();
                            break;
                    case 0: bandera = false;
                            break;
                    default: JOptionPane.showInputDialog("No es una opcion valida");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }
    
    public void logicaMenuInsercion(){
        
        boolean bandera = true;
        while (bandera){
            try {
                int op = Integer.parseInt(graficoMenuInsercion());
                switch (op) {
                    case 1: logica.insertarOperario();
                            break;
                    case 2: logica.insertarAdministrador();
                            break;
                    case 3: logica.insertarEjecutivo();
                            break;
                    case 0: bandera = false;
                            break;
                    default: JOptionPane.showInputDialog("No es una opcion valida");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }
    
    public void logicaMenuEliminacion(){
        boolean bandera = true;
        while (bandera){
            try {
                int op = Integer.parseInt(graficoMenuInicial());
                switch (op) {
                    case 1: logica.eliminarRegistroOperario();
                            break;
                    case 2: logica.eliminarRegistroAdministrador();
                            break;
                    case 3: logica.eliminarRegistroEjecutivo();
                            break;
                    case 0: bandera = false;
                            break;
                    default: JOptionPane.showInputDialog("No es una opcion valida");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }
    
    
}
