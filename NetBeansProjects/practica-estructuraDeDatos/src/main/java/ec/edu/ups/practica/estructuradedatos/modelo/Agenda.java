/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.estructuradedatos.modelo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Agenda <T>{
    private List <Contacto> listaContactos;
    private Contacto<T> cabeza;

    public Agenda() {
        listaContactos = new LinkedList();
    }
    
    public void agregar(Contacto contacto) {
        listaContactos.add(contacto);
        Contacto <T> nuevo = contacto;
        if (cabeza == null) {
            cabeza = nuevo;
        }else{
            Contacto<T> ultimoNodo = obtenerUltimo() ;
            ultimoNodo.setSiguiente(nuevo);
        }

    }
    public Contacto<T> obtenerUltimo() {
        Contacto <T> actual = cabeza;
        while (actual.getSiguiente() != null){
            actual = actual.getSiguiente();
            
        }
        return actual;
    }
    
    public T getElementByIndice(int indice) {
        Contacto <T> actual = cabeza;
        for(int i =0; i< indice; i++) {
            actual = actual.getSiguiente();
            
        }
        return (T) actual.getSiguiente();
    }
    public Contacto obtenerNodoByIndice(Object nombre){
        for(Contacto operadoraTelefonica: listaContactos){
            if( contacto.getNombre().equals(nombre)){
                return operadoraTelefonica;
                
            }
        }
        return null;
        }
    

    public void deleteByIndice(String nombre) {
        for(int i = 0; i<listaContactos.size();i++){
            Contacto contactoGuardado = listaContactos.element();
            if(contactoGuardado.getNombre()==(nombre)){
                listaContactos.remove();
                break;
            }

        }
    }
    

    
    
    
    
}
