public class Productos {
    protected String codigo;
    protected String modelo;


    public Productos(String codigo, String modelo) {
        this.setCodigo(codigo);
        this.setModelo(modelo);
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
