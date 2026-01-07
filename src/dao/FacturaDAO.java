package dao;

import conexionMySql.ConexMySql;
import interfaz.VentasInterface;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.CallableStatement;
import to.FacturaTO;
import java.sql.PreparedStatement;

public class FacturaDAO implements VentasInterface<FacturaTO>{

    @Override
    public void insert(FacturaTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_factura(?, ?, ?, ?, ?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_cliente());
        cs.setInt(2, objObjeto.getId_empleado());
        cs.setDouble(3, objObjeto.getStot_fact());
        cs.setDouble(4, objObjeto.getIgv_fact());
        cs.setDouble(5, objObjeto.getTota_fact());
        cs.execute();
    }
    
    public int obtenerIdFactura() throws Exception{
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "SELECT * FROM factura";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery();
        rs.last();
        return rs.getInt(1);
    }

    @Override
    public void update(FacturaTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(FacturaTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
