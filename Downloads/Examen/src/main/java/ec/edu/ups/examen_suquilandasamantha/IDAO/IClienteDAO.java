/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.IDAO;

import ec.edu.ups.examen_suquilandasamantha.modelo.Cliente;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface IClienteDAO {
    public void create(Cliente cliente);
    public Cliente read(int id);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);   
    public List<Cliente> findAll();
    
}
