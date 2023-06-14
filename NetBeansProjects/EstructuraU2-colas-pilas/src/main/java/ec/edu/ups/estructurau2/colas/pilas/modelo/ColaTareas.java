/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructurau2.colas.pilas.modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class ColaTareas<T> {
    private Queue <Tarea<T>> colaTareas;

    public ColaTareas() {
        colaTareas = new LinkedList();
    }
    
    public void agregarTarea (Tarea<T> tarea) {
        colaTareas.offer(tarea);
        
    }
    public Tarea<T> procesarTarea() {
        Tarea<T> tareaProcesada = colaTareas.poll();
        return tareaProcesada;
    }
    public boolean estaVacia () {
        return colaTareas.isEmpty();
    }

    @Override
    public String toString() {
        return "ColaTareas{" + "colaTareas=" + colaTareas + '}';
    }
    
    
    
}
