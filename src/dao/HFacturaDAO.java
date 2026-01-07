package dao;

import conexionMySql.ConexMySql;
import interfaz.VentasInterface;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class HFacturaDAO implements VentasInterface<Object>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "SELECT * FROM v_auditoria_factura";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
    public ResultSet buscarPorFecha(Object objObject1, Object objObject2) throws Exception{
        Connection cn = ConexMySql.getInstance().getConnection();
        String fechaInicio = objObject1.toString();
        String fechaFin = objObject2.toString();
        String sql = "SELECT * FROM v_auditoria_factura v WHERE DATE(fech_fact) BETWEEN ? and ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFin);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(Object objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Object objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
