/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.itmaster.empleadomanager;

import java.util.Objects;

/**
 *
 * @author itmasterprofessionaltraining
 */
public class Empleado {
    private Long id;
    private String nombre;
    private Integer edad;
    private double sueldo;
    private String dni;
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    

    public Empleado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer Edad) {
        this.edad = Edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.sueldo = Sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
    
    
}
