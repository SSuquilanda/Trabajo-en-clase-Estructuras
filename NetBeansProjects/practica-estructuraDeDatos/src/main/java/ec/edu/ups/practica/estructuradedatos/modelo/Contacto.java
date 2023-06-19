/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.estructuradedatos.modelo;

import java.util.Objects;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Contacto <T> {
    private T nombre;
    private T telefono;
    private Contacto<T> siguiente;
    private T contacto;

    public Contacto(T nombre, T telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(Contacto<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Contacto(T contacto) {
        this.contacto = contacto;
    }
    
    

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getTelefono() {
        return telefono;
    }

    public void setTelefono(T telefono) {
        this.telefono = telefono;
    }

    public Contacto<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Contacto<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getContacto() {
        return contacto;
    }

    public void setContacto(T contacto) {
        this.contacto = contacto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.telefono);
        hash = 97 * hash + Objects.hashCode(this.siguiente);
        hash = 97 * hash + Objects.hashCode(this.contacto);
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
        final Contacto<?> other = (Contacto<?>) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.siguiente, other.siguiente)) {
            return false;
        }
        return Objects.equals(this.contacto, other.contacto);
    }
    

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
}
