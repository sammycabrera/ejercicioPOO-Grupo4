package ejemplo_grupo4;

public class Cliente extends Persona {

    /**
     * Email del cliente
     */
    private String email;

    /**
     * Telefono
     */
    private String telefono;

    public Cliente() {
    }

    public Cliente(String email, String telefono) {
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
