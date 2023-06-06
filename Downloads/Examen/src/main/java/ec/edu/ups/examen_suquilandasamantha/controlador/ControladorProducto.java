/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.controlador;

import ec.edu.ups.examen_suquilandasamantha.IDAO.IProductoDAO;
import ec.edu.ups.examen_suquilandasamantha.modelo.Producto;
import ec.edu.ups.examen_suquilandasamantha.vista.VistaProducto;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorProducto {
    private VistaProducto vistaProducto;
    private Producto producto;
    private IProductoDAO productoDAO;

    public ControladorProducto(VistaProducto vistaProducto, Producto producto, IProductoDAO productoDAO) {
        this.vistaProducto = vistaProducto;
        this.producto = producto;
        this.productoDAO = productoDAO;
    }

    public ControladorProducto(VistaProducto vistaProducto, IProductoDAO productoDAO) {
        this.vistaProducto = vistaProducto;
        this.productoDAO = productoDAO;
    }

    public void registrarProducto() {
        producto = vistaProducto.ingresarProducto();
        productoDAO.create(producto);
    }

    public void verProducto() {
        int id = vistaProducto.buscarProducto();
        producto = productoDAO.read(id);
        vistaProducto.verProducto(producto);
    }

    public void actualizarProducto() {
        producto = vistaProducto.actualizarProducto();
        productoDAO.update(producto);
    }

    public void eliminarProducto() {
        producto = vistaProducto.eliminarProducto();
        productoDAO.delete(producto);
    }

    public void verProductos() {
        List<Producto> productos;
        productos = productoDAO.findAll();
        vistaProducto.verProductos(productos);
    }

}
