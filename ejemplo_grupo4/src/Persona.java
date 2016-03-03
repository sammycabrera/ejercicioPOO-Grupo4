
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
    
    
    
}


