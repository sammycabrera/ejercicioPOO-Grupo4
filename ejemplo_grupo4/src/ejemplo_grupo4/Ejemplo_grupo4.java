/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_grupo4;

import java.util.Date;

/**
 *
 * @author Pc
 */
public class Ejemplo_grupo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setID(1);
        persona1.setNombre("katherine");
        persona1.setApellido("blanco");
        Date fecha = new Date("06/12/1994");
        persona1.setFecha_nacimiento(fecha);
        persona1.setEstado_civil("ca");

        System.out.println(persona1);
        persona1.obtenerEdad();
    }

}
