/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.examen_suquilandasamantha.main;

import ec.edu.ups.examen_suquilandasamantha.DAO.CarritoCompraDAO;
import ec.edu.ups.examen_suquilandasamantha.DAO.ClienteDAO;
import ec.edu.ups.examen_suquilandasamantha.DAO.ProductoDAO;
import ec.edu.ups.examen_suquilandasamantha.controlador.ControladorCarritoCompra;
import ec.edu.ups.examen_suquilandasamantha.controlador.ControladorCliente;
import ec.edu.ups.examen_suquilandasamantha.controlador.ControladorProducto;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaCarritoCompra;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaCliente;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaProducto;
import java.text.ParseException;

/**
 *
 * @author ESTUDIANTE
 */
public class Principal {

    public static void main(String[] args) throws ParseException {
       VistaCarritoCompra vistaCarritoCompra = new VistaCarritoCompra();
        VistaCliente vistaCliente = new VistaCliente();
        VistaProducto vistaProducto = new VistaProducto();

        CarritoCompraDAO carritoCompraDAO = new CarritoCompraDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
        ProductoDAO productoDAO = new ProductoDAO();

        ControladorCarritoCompra controladorCarritoCompra = new ControladorCarritoCompra( vistaCarritoCompra, vistaCliente, vistaProducto, carritoCompraDAO, clienteDAO, productoDAO);
        ControladorCliente controladorCliente = new ControladorCliente(vistaCliente, clienteDAO);
        ControladorProducto controladorProducto = new ControladorProducto(vistaProducto, productoDAO);
        
        
        // Primero crear un cliente 
        controladorCliente.registrarCliente();
        
        
        // Segundo crear un producto 
        controladorProducto.registrarProducto();
        
        
        // Crear un carrito
        controladorCarritoCompra.registrarCarritoCompra();
        controladorCarritoCompra.verCarritoCompra();

        }
    }

