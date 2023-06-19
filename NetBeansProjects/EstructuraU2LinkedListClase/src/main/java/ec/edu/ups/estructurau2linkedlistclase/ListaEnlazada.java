/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructurau2linkedlistclase;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class ListaEnlazada {
    Nodo cabeza;
    
    public ListaEnlazada(){
        this.cabeza = null;
    }
    //Metodo insertar datos en la lista
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo (dato);
        if( cabeza == null) {
            cabeza = nuevoNodo;
            
        }else {
            Nodo nodoActual = cabeza;
            while(nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }
    //Metodo imprimir los elementos d ela lista
    public void imprimir(){
        Nodo nodoActual = cabeza;
        while(nodoActual != null)  {
            System.out.println(nodoActual.dato + " - ");
            nodoActual = nodoActual.siguiente;
            
        }
        System.out.println();
    }
}
