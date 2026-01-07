/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to;

/**
 *
 * @author Merca
 */
public class HFacturaTO {
    private int id_factura;
    private String fech_fact;
    private int id_cliente;
    private int id_empleado;
    private double stot_fact;
    private double igv_fact;
    private double tota_fact;
    private String obsv;
    private short esta_fact;
    private String trnasa;
    private String usuario;
    private String fechahora;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getFech_fact() {
        return fech_fact;
    }

    public void setFech_fact(String fech_fact) {
        this.fech_fact = fech_fact;
    }

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

    public String getObsv() {
        return obsv;
    }

    public void setObsv(String obsv) {
        this.obsv = obsv;
    }

    public short getEsta_fact() {
        return esta_fact;
    }

    public void setEsta_fact(short esta_fact) {
        this.esta_fact = esta_fact;
    }

    public String getTrnasa() {
        return trnasa;
    }

    public void setTrnasa(String trnasa) {
        this.trnasa = trnasa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }
    
    
    
}
