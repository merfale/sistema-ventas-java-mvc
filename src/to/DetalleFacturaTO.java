package to;

public class DetalleFacturaTO {
    private int id_factura;
    private int id_producto;
    private double prec_prod;
    private int cantidad;
    private double importe;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public double getPrec_prod() {
        return prec_prod;
    }

    public void setPrec_prod(double prec_prod) {
        this.prec_prod = prec_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
