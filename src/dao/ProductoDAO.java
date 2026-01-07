
package dao;

import conexionMySql.ConexMySql;
import interfaz.VentasInterface;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import to.ProductoTO;

public class ProductoDAO implements VentasInterface<ProductoTO> {

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "SELECT * FROM v_producto WHERE nomb_prod like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(ProductoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_producto(?, ?, ?, ?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNomb_prod());
        cs.setDouble(2, objObjeto.getPrec_prod());
        cs.setString(3, objObjeto.getObsv_prod());
        cs.setString(4, objObjeto.getFoto_prod());
        cs.execute();
    }

    @Override
    public void update(ProductoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_update_producto(?, ?, ?, ?, ?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_producto());
        cs.setString(2, objObjeto.getNomb_prod());
        cs.setDouble(3, objObjeto.getPrec_prod());
        cs.setString(4, objObjeto.getObsv_prod());
        cs.setString(5, objObjeto.getFoto_prod());
        cs.execute();
    }

    @Override
    public void delete(ProductoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_delete_producto(?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_producto());
        cs.execute();
    }
    
}
