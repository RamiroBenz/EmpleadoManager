package ar.com.itmaster.empleadomanager.persistencia;

import ar.com.itmaster.empleadomanager.Empleado;

public interface DAO {
    public void almacenar(Empleado empleado);
    
    public Empleado buscarEmpleado(Long id);
}
