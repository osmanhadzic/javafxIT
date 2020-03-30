package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    Connection conn = null;
    public static Connection ConDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dbLogin","root","konjuh123");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("ConnectionUtil : "+e.getMessage());
            return null;
        }
    }
}
