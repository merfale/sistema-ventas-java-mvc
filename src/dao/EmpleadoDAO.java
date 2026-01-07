package dao;

import conexionMySql.ConexMySql;
import interfaz.VentasInterface;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import to.EmpleadoTO;

public class EmpleadoDAO implements VentasInterface<EmpleadoTO>{

    @Override
    public void insert(EmpleadoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_insert_empleado(?,?,?,?,?,?,?,?,?,?,?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getNomb_empl());
        cs.setString(2, objObjeto.getApat_empl());
        cs.setString(3, objObjeto.getAmat_empl());
        cs.setString(4, objObjeto.getSexo_empl());
        cs.setString(5, objObjeto.getDire_empl());
        cs.setInt(6, objObjeto.getId_distrito());
        cs.setString(7, objObjeto.getTelf_empl());
        cs.setString(8, objObjeto.getCelu_empl());
        cs.setString(9, objObjeto.getEmai_empl());
        cs.setString(10, objObjeto.getObsv_empl());
        File objFile = new File(objObjeto.getFoto_empl());
        FileInputStream objFileInputStream = new FileInputStream(objFile);
        cs.setBinaryStream(11, objFileInputStream);
        cs.execute();
    }

    @Override
    public void update(EmpleadoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_update_empleado(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, LOAD_FILE(?))";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_empleado());
        cs.setString(2, objObjeto.getNomb_empl());
        cs.setString(3, objObjeto.getApat_empl());
        cs.setString(4, objObjeto.getAmat_empl());
        cs.setString(5, objObjeto.getSexo_empl());
        cs.setString(6, objObjeto.getDire_empl());
        cs.setInt(7, objObjeto.getId_distrito());
        cs.setString(8, objObjeto.getTelf_empl());
        cs.setString(9, objObjeto.getCelu_empl());
        cs.setString(10, objObjeto.getEmai_empl());
        cs.setString(11, objObjeto.getObsv_empl());
        cs.setString(12, objObjeto.getFoto_empl());
        cs.execute();
    }

    @Override
    public void delete(EmpleadoTO objObjeto) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String sql = "CALL sp_delete_empleado(?)";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setInt(1, objObjeto.getId_empleado());
        cs.execute();
    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "SELECT * FROM v_empleado where apat_empl like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
}
