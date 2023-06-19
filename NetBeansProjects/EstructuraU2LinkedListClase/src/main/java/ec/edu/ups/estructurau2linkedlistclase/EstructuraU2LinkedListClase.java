/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructurau2linkedlistclase;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class EstructuraU2LinkedListClase {

    public static void main(String[] args) {
        ListaEnlazadaGenerico<Integer> listaGenerica = new ListaEnlazadaGenerico<>() ;
        listaGenerica.agregar(10);
        listaGenerica.agregar(20);
        listaGenerica.agregar(30);
        listaGenerica.agregar(40);
        
        int elemento = listaGenerica.getElementByIndice(2);
        System.out.println("Elemento en el indice 2: " + elemento);
        
        
        listaGenerica.deleteByIndice(1);
        
        int elemento2 = listaGenerica.getElementByIndice(2);
        System.out.println("Elemento en el indice 2: " + elemento2);
    }
}
