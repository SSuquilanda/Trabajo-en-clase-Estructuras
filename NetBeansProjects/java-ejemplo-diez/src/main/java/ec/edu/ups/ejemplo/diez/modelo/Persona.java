/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.modelo;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Persona {
    private String cedula;
    private String nombre;
    private GregorianCalendar fechaNcaimiento;

    public Persona() {
    }
    

    public Persona(String cedula, String nombre, GregorianCalendar fechaNcaimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNcaimiento = fechaNcaimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getFechaNcaimiento() {
        return fechaNcaimiento;
    }

    public void setFechaNcaimiento(GregorianCalendar fechaNcaimiento) {
        this.fechaNcaimiento = fechaNcaimiento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.cedula);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.fechaNcaimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.fechaNcaimiento, other.fechaNcaimiento);
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", fechaNcaimiento=" + fechaNcaimiento + '}';
    }
    
    
    
}
