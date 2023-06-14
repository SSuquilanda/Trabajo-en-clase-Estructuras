/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.dao;

import ec.edu.ups.ejemplo.diez.idao.IOperadoraTelefonicaDAO;
import ec.edu.ups.ejemplo.diez.modelo.OperadoraTelefonica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class OperadoraTelefonicaDAO implements IOperadoraTelefonicaDAO{
    private List<OperadoraTelefonica> listaOperadorasTelefonicas;

    public OperadoraTelefonicaDAO(List<OperadoraTelefonica> listaOperadorasTelefonicas) {
        listaOperadorasTelefonicas = new ArrayList<>();
    }
    
    

    @Override
    public void create(OperadoraTelefonica operadoraTelefonica) {
        listaOperadorasTelefonicas.add(operadoraTelefonica);
    }

    @Override
    public OperadoraTelefonica read(int codigo) {
        for(OperadoraTelefonica operadoraTelefonica: listaOperadorasTelefonicas){
            if( operadoraTelefonica.getCodigo()==(codigo)){
                return operadoraTelefonica;
                
            }
        }
        return null;
    }

    @Override
    public void update(OperadoraTelefonica operadoraTelefonica) {
        for(int  i =0;i<listaOperadorasTelefonicas.size();i++){
            OperadoraTelefonica operadoraTelefonicaGuardada = listaOperadorasTelefonicas.get(i);
            if(operadoraTelefonicaGuardada.getCodigo()==operadoraTelefonica.getCodigo()){
                listaOperadorasTelefonicas.set(i, operadoraTelefonica);
                break;
            }
        }
        
    }

    @Override
    public void delete(int codigo) {
          for(int i = 0; i<listaOperadorasTelefonicas.size();i++){
            OperadoraTelefonica operadoraTelefonicaGuardada = listaOperadorasTelefonicas.get(i);
            if(operadoraTelefonicaGuardada.getCodigo()==(codigo)){
                listaOperadorasTelefonicas.remove(i);
                break;
            }

        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public List<OperadoraTelefonica> list() {
      return listaOperadorasTelefonicas;
        }
    }
    
    

