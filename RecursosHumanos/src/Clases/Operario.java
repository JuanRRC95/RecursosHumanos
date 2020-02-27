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
public class Operario extends Persona {
    
    private String cargoOperario;
    
    private int horasSemana;

    public Operario(String nombre, String apellido, int edad, double cedula, double sueldo,String cargoOperario,int horasSemana) {
        super(nombre, apellido, edad, cedula, sueldo);
        this.cargoOperario=cargoOperario;
        this.horasSemana=horasSemana;
    }

    public String getCargoOperario() {
        return cargoOperario;
    }

    public void setCargoOperario(String cargoOperario) {
        this.cargoOperario = cargoOperario;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Cardo del operario: " + cargoOperario + "\n"+
                "Horas Semanales :" + horasSemana + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
