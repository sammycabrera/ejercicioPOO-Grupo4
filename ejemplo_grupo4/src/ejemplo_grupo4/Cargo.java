package ejemplo_grupo4;

public class Cargo {

    /**
     * Id del cargo
     */
    private String ID_Cargo;

    /**
     * Descripcion del cargo
     */
    private String descripcion;

    public Cargo(String ID_Cargo, String descripcion) {
        this.ID_Cargo = ID_Cargo;
        this.descripcion = descripcion;
    }

    public String getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(String ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
