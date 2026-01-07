package to;

public class FacturaTO {
    private int id_cliente;
    private int id_empleado;
    private double stot_fact;
    private double igv_fact;
    private double tota_fact;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public double getStot_fact() {
        return stot_fact;
    }

    public void setStot_fact(double stot_fact) {
        this.stot_fact = stot_fact;
    }

    public double getIgv_fact() {
        return igv_fact;
    }

    public void setIgv_fact(double igv_fact) {
        this.igv_fact = igv_fact;
    }

    public double getTota_fact() {
        return tota_fact;
    }

    public void setTota_fact(double tota_fact) {
        this.tota_fact = tota_fact;
    }
}
