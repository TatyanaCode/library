package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcConnection {

    public JdbcConnection(String url, String userName, String password) {
    }

    private static Optional<Connection> connection = Optional.empty();
    private static final Logger LOGGER =
            Logger.getLogger(JdbcConnection.class.getName());


    public static Optional<Connection> getConnection() {
        if (connection.isEmpty()) {
            String url = "jdbc:postgres://localhost:5432/postgres";
            String userName = "postgres";
            String password = "root";

            try {
                connection = Optional.ofNullable(
                        DriverManager.getConnection(url, userName, password));
            } catch (SQLException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }
        return connection;


    }
}



