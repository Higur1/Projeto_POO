package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO {

    private Connection c;

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String hostname = "localhost";
        String dbName = "dbClinicaMedica";

        Class.forName("net.sourceforge.jtds.jdbc.Driver");

        c = DriverManager.getConnection(String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=sa;" +
                "password=123456", hostname, dbName));

        return c;
    }
}
