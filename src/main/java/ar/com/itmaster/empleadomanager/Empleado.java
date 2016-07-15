/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.itmaster.empleadomanager;

/**
 *
 * @author itmasterprofessionaltraining
 */
public class Empleado {
    private Long id;
    private String Nombre;
    private Integer Edad;
    private double Sueldo;
    private String dni;

    public Empleado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
    
    
}
