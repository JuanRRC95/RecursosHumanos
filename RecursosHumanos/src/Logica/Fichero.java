/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Operario;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Rodriguez
 */
public class Fichero {

    public Fichero() {

    }

    public void escribirFicheroSerializadoEditado(List<Object> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fichero.ddr"))) {
            for (Object obj : lista) {
                oos.writeObject(obj);
            }
        } catch (IOException e) {
        }
    }

    public void escribirFicheroSerializado(Object objeto) {
        List<Object> lista = new ArrayList<>();
        lista = traerLista();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fichero.ddr"))) {
            for (Object obj : lista) {
                oos.writeObject(obj);
            }
            oos.writeObject(objeto);
        } catch (IOException e) {
        }
    }

    public List<Object> traerLista() {
        List<Object> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fichero.ddr"))) {
            while (true) {
                Object aux = ois.readObject();
                lista.add(aux);
            }
        } catch (ClassNotFoundException e) {
        } catch (EOFException e) {
        } catch (IOException e) {
        }
        return lista;
    }

    public void imprimir() {
        List<Object> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fichero.ddr"))) {
            while (true) {
                Object obj = ois.readObject();
                if (obj instanceof Operario) {
                    System.out.println(((Operario)obj).getNombre());
                    System.out.println(((Operario)obj).getApellido());
                    System.out.println(((Operario)obj).getCargoOperario());
                    System.out.println(((Operario)obj).getCedula());
                    System.out.println(((Operario)obj).getEdad());
                   // System.out.println("Es una operario");
                }//else{
                //  if(obj instanceof Empleo){
                //      System.out.println(((Empleo)obj).getNombre());
                //   }
                // }
                //                Persona aux=(Persona)ois.readObject();
                //               System.out.println(aux.getNombre());

     //               Empleo aux2 = (Empleo)ois.readObject();
                //               System.out.println(aux2.getNombre());
            }
        } catch (ClassNotFoundException e) {
        } catch (EOFException e) {
        } catch (IOException e) {
        }
    }


}
