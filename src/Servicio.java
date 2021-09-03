public class Servicio {
    private Cliente cliente;
    private Impresoras impresoras;
    private String detelle;
    private double totalFacturado;

    public Servicio(Cliente cliente, Impresoras impresoras, String detelle, double totalFacturado) {
        this.setCliente(cliente);
        this.setImpresoras(impresoras);
        this.setDetelle(detelle);
        this.setTotalFacturado(totalFacturado);
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

    public String getDetelle() {
        return detelle;
    }

    public void setDetelle(String detelle) {
        this.detelle = detelle;
    }

    public double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }
}
