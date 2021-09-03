import interfaces.IReseteable;

public class Monitores extends Alquilable implements IReseteable {
    private String ResolucionMaxima;

    public Monitores(String codigo , String modelo , double precioHora, String ResolucionMaxima){
        super(codigo, modelo,precioHora);

        this.ResolucionMaxima=ResolucionMaxima;
    }

    public String getResolucionMaxima() {
        return ResolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        ResolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitores{" +
                "ResolucionMaxima='" + ResolucionMaxima + '\'' +
                ", precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Reseteando monitores.....");
    }
}
