/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.idao;

import ec.edu.ups.ejemplo.diez.modelo.Telefono;
import java.util.List;

/**
 *
 * @author samanthasuquilandaquilli
 */
public interface ITelefonoDAO {
    
    public void create(Telefono telefono);
    public Telefono read (String numero);
    public void update(Telefono telefono);
    public void delete (String numero);
    public List<Telefono>list();
}
