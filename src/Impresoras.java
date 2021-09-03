import interfaces.IReseteable;

public class Impresoras extends Productos implements IReseteable{
    private int velocidad;

    public Impresoras(String codigo , String modelo , int velocidad) {

        super(codigo, modelo);

        this.velocidad=velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Impresoras{" +
                "velocidad=" + velocidad +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Reseteando impresora.....");
    }
}


