/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.DAO;

import ec.edu.ups.examen_suquilandasamantha.IDAO.IClienteDAO;
import ec.edu.ups.examen_suquilandasamantha.modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ClienteDAO implements IClienteDAO {
    private List<Cliente> listaCliente;

    
    public ClienteDAO(){
        listaCliente = new ArrayList<>();
    }
    
    
    @Override
    public void create(Cliente cliente) {
        listaCliente.add(cliente);
    }

    @Override
    public Cliente read(int id) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getId()==id) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente c = listaCliente.get(i);
            if (c.getId()==(cliente.getId())) {
                listaCliente.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Iterator<Cliente> it = listaCliente.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getId()==(cliente.getId())){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cliente> findAll() {
        return listaCliente;
    }
    
    
    
}
