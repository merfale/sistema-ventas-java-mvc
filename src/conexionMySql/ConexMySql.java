package conexionMySql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexMySql {
    
    private static ConexMySql instance = null;
    
    private Connection connection = null;

    public ConexMySql() throws Exception {
        String url = "jdbc:mysql://localhost:3306/venta202502";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, "root", "");
    }

    public static ConexMySql getInstance() throws Exception {
        if (instance == null){
            instance = new ConexMySql();
        }
        return instance;
    }
    
    public Connection getConnection() {
        return connection;
    }

    @Override
    protected void finalize() throws Throwable {
            connection.close();
            connection = null;
            super.finalize();
    }
    
}
