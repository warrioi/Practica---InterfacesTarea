import java.util.Date;

public class Compra {
    private Provedores provedores;
    private Productos productos;
    private Date fecha;
    private int cantidad;

    public Compra(Provedores provedores, Productos productos, Date fecha, int cantidad) {
        this.setProvedores(provedores);
        this.setProductos(productos);
        this.setFecha(fecha);
        this.setCantidad(cantidad);
    }

    public Provedores getProvedores() {
        return provedores;
    }

    public void setProvedores(Provedores provedores) {
        this.provedores = provedores;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
