public class Provedores {
    private String nif;
    private String  direccion;

    public Provedores(String nif, String direccion) {
        this.setNif(nif);
        this.setDireccion(direccion);
    }


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
