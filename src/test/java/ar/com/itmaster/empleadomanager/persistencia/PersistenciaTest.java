package ar.com.itmaster.empleadomanager.persistencia;

import ar.com.itmaster.empleadomanager.Empleado;
import junit.framework.TestCase;

public class PersistenciaTest extends TestCase {

    public PersistenciaTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSalvarEmpleadoEnMemoria() {
        Empleado empleado=new Empleado();
        
        empleado.setNombre("Cosme Fulanito");
        empleado.setEdad(33);
        
        DAO db = new DBInMemory();
        db.almacenar(empleado);
        Long id=empleado.getId();
        Empleado empleadoDesdeLaBase=db.buscarEmpleado(id);
        
        assertEquals(empleado, empleadoDesdeLaBase);   
    }
    
    public void testSalvarEmpleadoEnArchivo() {
        Empleado empleado=new Empleado();
        
        empleado.setNombre("Cosme Fulanito");
        empleado.setEdad(33);
        empleado.setSueldo(99999);
        
        DAO db = new DBInFile();
        db.almacenar(empleado);
        
        Long id=empleado.getId();
        Empleado empleadoDesdeLaBase=db.buscarEmpleado(id);
        
        assertEquals(empleado, empleadoDesdeLaBase);   
    }
}
