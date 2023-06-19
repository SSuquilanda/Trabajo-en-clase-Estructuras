/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.estructuradedatos.modelo;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class ListaEnlazada <T> {
    private Contacto<T> cabeza;
    private int tamaño;
    
    //Agregar
    public void agregar(T contacto) {
        Contacto<T> nuevo = new Contacto (contacto);
        if (cabeza == null) {
            cabeza = nuevo;
        }else{
            Contacto<T> ultimoNodo = obtenerUltimo() ;
            ultimoNodo.setSiguiente(nuevo);
        }
        tamaño++;
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
    public Contacto<T> obtenerNodoByIndice(int indice){
        Contacto<T> nodoActual = cabeza;
        for(int i =0; i< indice; i++) {
            nodoActual = nodoActual.getSiguiente();
            
        }
        return nodoActual;
    
}
}
