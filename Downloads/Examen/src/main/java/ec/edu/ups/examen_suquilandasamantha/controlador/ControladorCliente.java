/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.controlador;

import ec.edu.ups.examen_suquilandasamantha.IDAO.IClienteDAO;
import ec.edu.ups.examen_suquilandasamantha.modelo.Cliente;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaCliente;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorCliente {
    private VistaCliente vistaCliente;
    private Cliente cliente;
    private IClienteDAO clienteDAO;

    public ControladorCliente(VistaCliente vistaCliente, Cliente cliente, IClienteDAO clienteDAO) {
        this.vistaCliente = vistaCliente;
        this.cliente = cliente;
        this.clienteDAO = clienteDAO;
    }

    public ControladorCliente(VistaCliente vistaCliente, IClienteDAO clienteDAO) {
        this.vistaCliente = vistaCliente;
        this.clienteDAO = clienteDAO;
    }

    public void registrarCliente() {
        cliente = vistaCliente.ingresarCliente();
        clienteDAO.create(cliente);
    }

    public void verCliente() {
        int id = vistaCliente.buscarCliente();
        cliente = clienteDAO.read(id);
        vistaCliente.verCliente(cliente);
    }

    public void actualizarCliente() {
        cliente = vistaCliente.actualizarCliente();
        clienteDAO.update(cliente);
    }

    public void eliminarCliente() {
        cliente = vistaCliente.eliminarCliente();
        clienteDAO.delete(cliente);
    }

    public void verClientes() {
        List<Cliente> clientes;
        clientes = clienteDAO.findAll();
        vistaCliente.verClientes(clientes);
    }

}
