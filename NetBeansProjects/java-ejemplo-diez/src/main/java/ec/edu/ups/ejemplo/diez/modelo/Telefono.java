/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.modelo;

import java.util.Objects;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Telefono {
    private String numero;
    private String tipo;
    private Persona unaPersona;
    private OperadoraTelefonica unaOperadoraTelefonica;

    public Telefono() {
    }

    public Telefono(String numero, String tipo, Persona unaPersona, OperadoraTelefonica unaOperadoraTelefonica) {
        this.numero = numero;
        this.tipo = tipo;
        this.unaPersona = unaPersona;
        this.unaOperadoraTelefonica = unaOperadoraTelefonica;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    public OperadoraTelefonica getUnaOperadoraTelefonica() {
        return unaOperadoraTelefonica;
    }

    public void setUnaOperadoraTelefonica(OperadoraTelefonica unaOperadoraTelefonica) {
        this.unaOperadoraTelefonica = unaOperadoraTelefonica;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.numero);
        hash = 83 * hash + Objects.hashCode(this.tipo);
        hash = 83 * hash + Objects.hashCode(this.unaPersona);
        hash = 83 * hash + Objects.hashCode(this.unaOperadoraTelefonica);
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
        final Telefono other = (Telefono) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.unaPersona, other.unaPersona)) {
            return false;
        }
        return Objects.equals(this.unaOperadoraTelefonica, other.unaOperadoraTelefonica);
    }
    public void agregarPersona(Persona persona) {
        
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", tipo=" + tipo + ", unaPersona=" + unaPersona + ", unaOperadoraTelefonica=" + unaOperadoraTelefonica + '}';
    }

    

}
