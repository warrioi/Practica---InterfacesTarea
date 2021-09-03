import java.util.Date;

public class Tecnologico extends Productos{

    protected String PaisOrigen;
    protected Date FechaFabricacion;
    protected Empresa fabricante;

    public Tecnologico(String codigo, String modelo , String PaisoRIGEN, Date fechaFabricacion, Empresa fabricante){
        super(codigo, modelo);

        this.setPaisOrigen(PaisoRIGEN);
        this.setFechaFabricacion(fechaFabricacion);
        this.setFabricante(fabricante);

    }


    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return FechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        FechaFabricacion = fechaFabricacion;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Tecnologico{" +
                "PaisOrigen='" + PaisOrigen + '\'' +
                ", FechaFabricacion=" + FechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
