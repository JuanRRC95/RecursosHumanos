/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

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
    
    
    public Fichero(){
        
    }
    
    public void escribirFicheroSerializado(Object objeto){
        List<Object> lista = new ArrayList<>();
        lista=traerLista();
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("fichero.ddr"))){
            for (Object obj : lista) {
                oos.writeObject(obj);
            }
            oos.writeObject(objeto);
        }catch(IOException e){
        }
    }
    
    public List<Object> traerLista(){
        List<Object> lista = new ArrayList<>();
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("fichero.ddr"))){
           while(true){
                Object aux=ois.readObject();
                lista.add(aux);
            }
        }catch(ClassNotFoundException e){
        }catch(EOFException e){
        }catch(IOException e){
        }
        return lista;
    }
    
    /*
    public void imprimir(){
        List<Persona> lista = new ArrayList<>();
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("fichero.ddr"))){
            while(true){
                Object obj = ois.readObject();
                if(obj instanceof Persona){
                    //System.out.println(((Persona)obj).getNombre());
                    System.out.println("Es una persona");
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
        }catch(ClassNotFoundException e){
        }catch(EOFException e){
        }catch(IOException e){
        }
    }
    */
    
}
