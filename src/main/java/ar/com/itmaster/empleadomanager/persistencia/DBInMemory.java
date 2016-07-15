/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.itmaster.empleadomanager.persistencia;

import ar.com.itmaster.empleadomanager.Empleado;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ITMaster
 */
public class DBInMemory {
    private Long lastId=0L;
    
    private  Map<Long, Empleado> datos=new HashMap<>();
    
    
    
    
    public void almacenar(Empleado empleado) {
        //Validacion..
        if(empleado==null){
            throw new IllegalArgumentException("El Empleado no es null");
            
        }
        if(empleado.getId()!=null){
            throw new IllegalArgumentException("El Empleado ya existe");
            
        }
        //Salvar
        lastId=lastId+1L;
        empleado.setId(lastId);
        
        datos.put(empleado.getId(), empleado);
        
        
    }

    public Empleado buscarEmpleado(Long id) {
        return null;
        
    }

  
    
    
    
}
