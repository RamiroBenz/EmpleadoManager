/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.itmaster.empleadomanager.persistencia;

import ar.com.itmaster.empleadomanager.Empleado;
import junit.framework.TestCase;

/**
 *
 * @author ITMaster
 */
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

    public void testSalvarEmpleado() {
        Empleado empleado=new Empleado();
        
        empleado.setNombre("Cosme Fulanito");
        empleado.setEdad(33);
        
        DBInMemory db = new DBInMemory();
        db.almacenar(empleado);
        Long id=empleado.getId();
        Empleado empleadoDesdeLaBase=db.buscarEmpleado(id);
        
        assertEquals(empleado, empleadoDesdeLaBase);
        
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
