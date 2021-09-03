import java.util.Date;

public class Venta {
    private Cliente cliente;
    private Impresoras impresoras;
    private Date fecha;

    public Venta(Cliente cliente, Impresoras impresoras, Date fecha) {
        this.setCliente(cliente);
        this.setImpresoras(impresoras);
        this.setFecha(fecha);
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresoras getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(Impresoras impresoras) {
        this.impresoras = impresoras;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
