/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructurau2.colas.pilas;

import ec.edu.ups.estructurau2.colas.pilas.modelo.ColaTareas;
import ec.edu.ups.estructurau2.colas.pilas.modelo.PilaTareas;
import ec.edu.ups.estructurau2.colas.pilas.modelo.Tarea;
import java.util.ArrayList;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class EstructuraU2ColasPilas {

    public static void main(String[] args) {
        System.out.println(" Colas y Pilas implementacion generica");
        //Clases ColaTarea
        ColaTareas<String> colaTareas = new ColaTareas<>();
        ColaTareas<Integer> colaTareasInt = new ColaTareas<>();//Ingresar 3 elementos
        int [] n = {1, 3 , 5 , 8};
        int [] v = {1, 3 , 5 , 8};
        int [] a = {1, 3 , 5 , 8};
        ColaTareas<int[]>colaTareasArregloEnteros = new ColaTareas<>(); //Ingresar 3 elementos
        String[] k = {"Kiuvo", "Como", "Estas?"};
        String[] p = {"Hola", "Estrellita"};      
        String[] m = {"Pana", "Como", "te va?"};
        ColaTareas<String[]> colaTareasArregloString = new ColaTareas <>(); //Ingresar 3 elementos
        
        //inserccion cola tareas string
        colaTareas.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTareas.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTareas.agregarTarea(new Tarea(5, "Tarea 5"));
        
        //Inserccion colaTareas int
        colaTareasInt.agregarTarea(new Tarea(1, 1));
        colaTareasInt.agregarTarea(new Tarea(2, 2));
        colaTareasInt.agregarTarea(new Tarea(3, 3));
        
        //Inserccion colaTareas arregloEnteros
        colaTareasArregloEnteros.agregarTarea(new Tarea(1, n));
        colaTareasArregloEnteros.agregarTarea(new Tarea(1, v));
        colaTareasArregloEnteros.agregarTarea(new Tarea(1, a));
        
        //Inserccion colaTareas arregloString
        colaTareasArregloString.agregarTarea(new Tarea(1, k));
        colaTareasArregloString.agregarTarea(new Tarea(1, p));
        colaTareasArregloString.agregarTarea(new Tarea(1, m));

        //Clases PilaTarea
        PilaTareas<Integer> pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTareas> pilaTareasDeColas = new PilaTareas<>();

        
        
        //Inserccion de tareas a la pila 
        pilaTareas.agregarTarea(new Tarea(6,6));
        pilaTareas.agregarTarea(new Tarea(7,7));
        pilaTareas.agregarTarea(new Tarea(8,8));
        
        pilaTareasDeColas.agregarTarea(new Tarea(9,9));
        pilaTareasDeColas.agregarTarea(new Tarea(10,10));
        pilaTareasDeColas.agregarTarea(new Tarea(11,11));


        
        
        
        while (!colaTareas.estaVacia()){
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();
            
  
            System.out.println("Procesando tarea de la cola: \n\t Sale--> " +tareaProcesada.getId()+" - "+tareaProcesada.getAtributo());
        }
        while (!colaTareasInt.estaVacia()){
            Tarea<Integer> tareaProcesada = colaTareasInt.procesarTarea();
            System.out.println("Procesando tarea de la cola: \n\t Sale--> " +tareaProcesada.getId()+" - "+tareaProcesada.getAtributo());

        }
        while (!colaTareasArregloEnteros.estaVacia()){
            Tarea<int[]> tareaProcesada = colaTareasArregloEnteros.procesarTarea();
            System.out.println("Procesando tarea de la cola: \n\t Sale--> " +tareaProcesada.getId()+" - "+tareaProcesada.getAtributo());

        }
        while (!colaTareasArregloString.estaVacia()){
            Tarea<String[]> tareaProcesada = colaTareasArregloString.procesarTarea();
            System.out.println("Procesando tarea de la cola: \n\t Sale--> " +tareaProcesada.getId()+" - "+tareaProcesada.getAtributo());

        }
        
        while (!pilaTareas.estaVacia()){
            Tarea<Integer> tareaProcesada = pilaTareas.procesarTarea();
            
  
            System.out.println("Procesando tarea de la cola: \n\t Sale--> " +tareaProcesada.getId()+" - "+tareaProcesada.getAtributo());
        }
        while (!pilaTareasDeColas.estaVacia()){
            Tarea<ColaTareas> tareaCola = pilaTareasDeColas.procesarTarea();
            
  
            System.out.println("Procesando tarea de la cola: \n\t Sale--> " +tareaCola.getId()+" - "+tareaCola.getAtributo());
        }


    }
}
