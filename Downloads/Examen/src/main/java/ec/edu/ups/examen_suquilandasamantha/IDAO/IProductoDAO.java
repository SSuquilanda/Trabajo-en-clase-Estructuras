/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.IDAO;

import ec.edu.ups.examen_suquilandasamantha.modelo.Producto;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface IProductoDAO {
    public void create(Producto producto);
    public Producto read(int id);
    public void update(Producto producto);
    public void delete(Producto producto);   
    public List<Producto> findAll();
}
