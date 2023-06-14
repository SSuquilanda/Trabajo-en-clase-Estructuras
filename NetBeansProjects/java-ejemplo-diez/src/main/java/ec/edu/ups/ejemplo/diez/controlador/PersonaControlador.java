/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.controlador;

import ec.edu.ups.ejemplo.diez.idao.IPersonaDAO;
import ec.edu.ups.ejemplo.diez.modelo.Persona;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class PersonaControlador {
    private Persona persona;
    private IPersonaDAO personaDAO;

    public PersonaControlador(IPersonaDAO personaDAO) {        
        this.personaDAO = personaDAO;
    }
    
    public void crear(Persona persona){
        this.persona = persona;
        personaDAO.create(persona);
    }

    
}
