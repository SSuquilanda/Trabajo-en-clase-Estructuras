/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.controlador;

import ec.edu.ups.examen_suquilandasamantha.DAO.ClienteDAO;
import ec.edu.ups.examen_suquilandasamantha.IDAO.ICarritoCompraDAO;
import ec.edu.ups.examen_suquilandasamantha.IDAO.IClienteDAO;
import ec.edu.ups.examen_suquilandasamantha.IDAO.IProductoDAO;
import ec.edu.ups.examen_suquilandasamantha.modelo.CarritoCompra;
import ec.edu.ups.examen_suquilandasamantha.modelo.Cliente;
import ec.edu.ups.examen_suquilandasamantha.modelo.Producto;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaCarritoCompra;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaCliente;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaProducto;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorCarritoCompra {
    private VistaCarritoCompra vistaCarritoCompra;
    private VistaCliente vistaCliente;
    private VistaProducto vistaProducto;
    private CarritoCompra carritoCompra;
    private Cliente cliente;
    private Producto producto;
    private ICarritoCompraDAO carritoCompraDAO;
    private IClienteDAO clienteDAO;
    private IProductoDAO productoDAO;
    
    
    public ControladorCarritoCompra(VistaCarritoCompra vistaCarritoCompra, VistaCliente vistaCliente, VistaProducto vistaProducto, CarritoCompra carritoCompra, Cliente cliente, Producto producto, ICarritoCompraDAO carritoCompraDAO) {
        this.vistaCarritoCompra = vistaCarritoCompra;
        this.vistaCliente = vistaCliente;
        this.vistaProducto = vistaProducto;
        this.carritoCompra = carritoCompra;
        this.cliente = cliente;
        this.producto = producto;
        this.carritoCompraDAO = carritoCompraDAO;
    }

    public ControladorCarritoCompra(VistaCarritoCompra vistaCarritoCompra, VistaCliente vistaCliente, VistaProducto vistaProducto, ICarritoCompraDAO carritoCompraDAO, IClienteDAO clienteDAO, IProductoDAO productoDAO) {
        this.vistaCarritoCompra = vistaCarritoCompra;
        this.vistaCliente = vistaCliente;
        this.vistaProducto = vistaProducto;
        this.carritoCompraDAO = carritoCompraDAO;
        this.clienteDAO = clienteDAO;
        this.productoDAO = productoDAO;
    }

    public void registrarCarritoCompra() throws ParseException  {
        carritoCompra = vistaCarritoCompra.ingresarCarritoCompra();
        int idC= vistaCliente.buscarCliente();
        cliente = clienteDAO.read(idC);
        int idP = vistaProducto.buscarProducto();
        producto = productoDAO.read(idP);
        carritoCompra.agregarCliente(cliente);
        carritoCompra.agregarProducto(producto);
        double iva = carritoCompra.calcularIva(carritoCompra);
        carritoCompra.setIva(iva);
        double total = carritoCompra.calcularTotal(carritoCompra);
        carritoCompra.setTotal(total);
        carritoCompraDAO.create(carritoCompra);
        System.out.println(carritoCompra);
    }

    public void verCarritoCompra() {
        int id = vistaCarritoCompra.buscarCarritoCompra();
        carritoCompra = carritoCompraDAO.read(id);
        vistaCarritoCompra.verCarritoCompra(carritoCompra);
    }

    public void actualizarCarritoCompra() throws ParseException {
        carritoCompra = vistaCarritoCompra.actualizarCarritoCompra();
        carritoCompraDAO.update(carritoCompra);
    }

    public void eliminarCarritoCompra() {
        carritoCompra = vistaCarritoCompra.eliminarCarritoCompra();
        carritoCompraDAO.delete(carritoCompra);
    }

    public void verCarritos() {
        List<CarritoCompra> carritos;
        carritos = carritoCompraDAO.findAll();
        vistaCarritoCompra.verCarritos(carritos);
    }
    
}
