package ar.com.itmaster.empleadomanager.persistencia;

import ar.com.itmaster.empleadomanager.Empleado;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBInFile implements DAO {

    private File misDatos;
    private Long lastId=0L;
    
    public DBInFile() {
        misDatos = new File("misdatos.txt");
        
        if (!misDatos.exists()) {
            try (FileWriter writer = new FileWriter(misDatos); BufferedWriter bw = new BufferedWriter(writer);){
            bw.write("ID");
            bw.write(",");
            bw.write("Nombre");
            bw.write(",");
            bw.write("Edad");
            bw.write(",");
            bw.write("DNI");
            bw.write(",");
            bw.write("Sueldo");
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(DBInFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    @Override
    public void almacenar(Empleado empleado) {
        // Generacion Id
        lastId=lastId+1L;
        empleado.setId(lastId);
        
        try (FileWriter writer = new FileWriter(misDatos, true); BufferedWriter bw = new BufferedWriter(writer);){
            bw.write(empleado.getId().toString());
            bw.write(",");
            bw.write(empleado.getNombre());
            bw.write(",");
            bw.write(empleado.getEdad().toString());
            bw.write(",");
            bw.write(empleado.getDni() != null ? empleado.getDni() : "DNI No Asignado");
            bw.write(",");
            bw.write(Double.toString(empleado.getSueldo()));
        } catch (IOException ex) {
            Logger.getLogger(DBInFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Empleado buscarEmpleado(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
