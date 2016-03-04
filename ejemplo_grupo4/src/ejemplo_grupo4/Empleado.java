package ejemplo_grupo4;

public class Empleado extends Persona {

    /**
     * Atributo Asegurodara de riesgos profecionales
     */
    private String ARP;
    /**
     * atributo entidad prestadora de salud
     */
    private String EPS;
    /**
     * cargo del empleado
     */
    private Cargo cargo;

    public Empleado() {
    }

    public Empleado(String ARP, String EPS, Cargo cargo) {
        this.ARP = ARP;
        this.EPS = EPS;
        this.cargo = cargo;
    }

    public String getARP() {
        return ARP;
    }

    public void setARP(String ARP) {
        this.ARP = ARP;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{Id=" + getID() + "nombre=" + getNombre() + ",apellido=" + getApellido()
                + ",fecha_nacimiento=" + getFecha_nacimiento() + ",estado_civil=" + getEstado_civil()
                + "cargo=" + cargo.getID_Cargo() + ", ARP=" + ARP + ", EPS=" + EPS + "}";
    }

}
