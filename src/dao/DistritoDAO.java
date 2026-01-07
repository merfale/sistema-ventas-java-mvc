package dao;

import conexionMySql.ConexMySql;
import interfaz.VentasInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import to.DistritoTO;

public class DistritoDAO implements VentasInterface<DistritoTO>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "SELECT * FROM v_distrito WHERE nomb_dist like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    @Override
    public void insert(DistritoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_distrito(?, ?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNomb_dist());
        cs.setString(2, objObjeto.getObsv_dist());  
        cs.execute();
    }

    @Override
    public void update(DistritoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_update_distrito(?, ?, ?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_distrito());
        cs.setString(2, objObjeto.getNomb_dist());
        cs.setString(3, objObjeto.getObsv_dist());
        cs.execute();
    }

    @Override
    public void delete(DistritoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_delete_distrito(?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_distrito());
        cs.execute();
    }
    
}
