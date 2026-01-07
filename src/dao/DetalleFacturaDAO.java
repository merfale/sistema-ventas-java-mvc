package dao;

import conexionMySql.ConexMySql;
import interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import to.DetalleFacturaTO;

public class DetalleFacturaDAO implements VentasInterface<DetalleFacturaTO>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(DetalleFacturaTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_detalle_factura(?, ?, ?, ?, ?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_factura());
        cs.setInt(2, objObjeto.getId_producto());
        cs.setDouble(3, objObjeto.getPrec_prod());
        cs.setInt(4, objObjeto.getCantidad());
        cs.setDouble(5, objObjeto.getImporte());
        cs.execute();
    }

    @Override
    public void update(DetalleFacturaTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(DetalleFacturaTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
