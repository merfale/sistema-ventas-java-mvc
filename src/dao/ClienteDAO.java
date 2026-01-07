/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexionMySql.ConexMySql;
import interfaz.VentasInterface;
import java.sql.ResultSet;
import to.ClienteTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Merca
 */
public class ClienteDAO implements VentasInterface<ClienteTO>{

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConexMySql.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "SELECT * FROM v_cliente where nomb_clie like ?";
        PreparedStatement ps = cn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery () ;
        return rs;
    }

    @Override
    public void insert(ClienteTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ClienteTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(ClienteTO objObjeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
