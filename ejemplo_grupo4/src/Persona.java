
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Persona {
    /**
     * identidad del usuario
     */
    private int ID;
    /**
     * Nombre de la persona
     */
    private String nombre;
    /**
     * Apellidos
     */
    private String apellido;
    /**
     * Fecha de nacimiento
     */
    private Date fecha_nacimiento;
    /**
     * estado civil
     */
    private String estado_civil;

    public Persona() {
    }

    public Persona(int ID, String nombre, String apellido, Date fecha_nacimiento, String estado_civil) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado_civil = estado_civil;
    }
    //modificadores y analizadores

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    
    
    
}


