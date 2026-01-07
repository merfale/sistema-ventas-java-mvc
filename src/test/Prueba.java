package test;

import conexionMySql.ConexMySql;
import java.sql.Connection;

public class Prueba {
    public static void main(String[] args) {
        try {
            Connection cn = ConexMySql.getInstance().getConnection();
            System.out.println("CONEXION ESTABLECIDA");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION");
        }
    }
}
