package Application;

import java.sql.*;

public class ConnectionUtil {

    Connection conn = null;

    public static Connection connectdb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://freshcase.dk:3306/freshcas_p2", "freshcas_p2", "kris!2345Q");
            return conn;
        } catch (Exception e) {
            System.out.println("Connection failed, check connection details, or the server might be offline");
            return null;
        }
    }
}
