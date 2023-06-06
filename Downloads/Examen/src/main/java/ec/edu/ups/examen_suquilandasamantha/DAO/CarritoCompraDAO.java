/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.DAO;

import ec.edu.ups.examen_suquilandasamantha.IDAO.ICarritoCompraDAO;
import ec.edu.ups.examen_suquilandasamantha.modelo.CarritoCompra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author ESTUDIANTE
 */
public class CarritoCompraDAO implements ICarritoCompraDAO {
    private List<CarritoCompra> listaCarritoCompra;
    
    public CarritoCompraDAO(){
        listaCarritoCompra = new ArrayList<>();
    }

    @Override
    public void create(CarritoCompra carritoCompra) {
        listaCarritoCompra.add(carritoCompra);
    }

    @Override
    public CarritoCompra read(int id) {
        for (CarritoCompra carrito : listaCarritoCompra) {
            if (carrito.getCodigo() == id) {
                return carrito;
            }
        }
        return null;
    }

    @Override
    public void update(CarritoCompra carritoCompra) {
        for (int i = 0; i < listaCarritoCompra.size(); i++) {
            CarritoCompra c = listaCarritoCompra.get(i);
            if (c.getCodigo() == carritoCompra.getCodigo()) {
                listaCarritoCompra.set(i, carritoCompra);
                break;
            }
        }
    }

    @Override
    public void delete(CarritoCompra carritoCompra) {

        Iterator<CarritoCompra> it = listaCarritoCompra.iterator();
        while (it.hasNext()) {
            CarritoCompra c = it.next();
            if (c.getCodigo() == carritoCompra.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<CarritoCompra> findAll() {
        return listaCarritoCompra;
    }
   
    
    
    
}
