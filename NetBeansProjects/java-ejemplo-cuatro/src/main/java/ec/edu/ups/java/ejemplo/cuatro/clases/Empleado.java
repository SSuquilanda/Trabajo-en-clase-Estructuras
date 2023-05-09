/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.cuatro.clases;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Empleado extends Persona {
    private String cargo;
    
    public Empleado () { 
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void asignarCrago () {
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + '}';
    }
    
    
}
