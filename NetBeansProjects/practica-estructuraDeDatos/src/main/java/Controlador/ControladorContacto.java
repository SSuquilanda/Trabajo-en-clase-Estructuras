/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ec.edu.ups.practica.estructuradedatos.modelo.Agenda;
import ec.edu.ups.practica.estructuradedatos.modelo.Contacto;
import vista.VistaContacto;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class ControladorContacto {
    private VistaContacto vistaContacto;
    private Contacto contacto;
    private Agenda agenda;
    
    public ControladorContacto(VistaContacto vistaContacto, Contacto contacto, Agenda agenda) {
        this.vistaContacto = vistaContacto;
        this.contacto = contacto;
        this.agenda= agenda;
    }
    public void registrarContacto () {
        contacto = vistaContacto.ingresarContacto();
        agenda.agregar(contacto);
    }
    public String eliminarContacto() {
        String nombre = vistaContacto.buscarContactoNombre();
        contacto = agenda.obtenerNodoByIndice();
        agenda.deleteByIndice(contacto);
    }
    public void buscarContacto (){
        
    }
    
   
    
    
}
