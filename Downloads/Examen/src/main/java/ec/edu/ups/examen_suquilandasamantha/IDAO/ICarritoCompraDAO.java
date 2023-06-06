/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.IDAO;

import ec.edu.ups.examen_suquilandasamantha.modelo.CarritoCompra;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface ICarritoCompraDAO {
    public void create(CarritoCompra carrito);
    public CarritoCompra read(int id);
    public void update(CarritoCompra carrito);
    public void delete(CarritoCompra carrito);   
    public List<CarritoCompra> findAll();
}
