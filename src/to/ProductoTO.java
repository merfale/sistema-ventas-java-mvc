package to;

public class ProductoTO {
    private int id_producto;
    private String nomb_prod;
    private double prec_prod;
    private String obsv_prod;
    private String foto_prod;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNomb_prod() {
        return nomb_prod;
    }

    public void setNomb_prod(String nomb_prod) {
        this.nomb_prod = nomb_prod;
    }

    public double getPrec_prod() {
        return prec_prod;
    }

    public void setPrec_prod(double prec_prod) {
        this.prec_prod = prec_prod;
    }

    public String getObsv_prod() {
        return obsv_prod;
    }

    public void setObsv_prod(String obsv_prod) {
        this.obsv_prod = obsv_prod;
    }

    public String getFoto_prod() {
        return foto_prod;
    }

    public void setFoto_prod(String foto_prod) {
        this.foto_prod = foto_prod;
    }
}
