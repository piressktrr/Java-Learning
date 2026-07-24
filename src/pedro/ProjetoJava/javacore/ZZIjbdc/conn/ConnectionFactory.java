package pedro.ProjetoJava.javacore.ZZIjbdc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public  static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String user =  "root";
        String password = "1234";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  null;
    }
}
