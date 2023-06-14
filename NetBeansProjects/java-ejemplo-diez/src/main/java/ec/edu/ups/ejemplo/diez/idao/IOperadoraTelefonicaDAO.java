/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.idao;

import ec.edu.ups.ejemplo.diez.modelo.OperadoraTelefonica;
import java.util.List;

/**
 *
 * @author samanthasuquilandaquilli
 */
public interface IOperadoraTelefonicaDAO {
    public void create(OperadoraTelefonica operadoraTelefonica);
    public OperadoraTelefonica read(int codigo);
    public void update (OperadoraTelefonica operadoraTelefonica);
    public void delete(int codigo);
    public List<OperadoraTelefonica>list();
    
}
