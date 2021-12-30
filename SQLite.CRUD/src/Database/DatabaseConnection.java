package Database;

import java.sql.*;

public class DatabaseConnection {

    private final String URL;
    private final String DRIVER;
    private Connection connection;

    public DatabaseConnection() {
        this.DRIVER = "jdbc:sqlite";
        this.URL = "src/DataBase/Escuela.db";
        this.connection = null;
    }

    protected Connection getConnection() {
        return connection;
    }

    protected void connectDatabase() throws SQLException {
        if ((this.connection == null) || (this.connection.isClosed())) {
            this.connection = DriverManager.getConnection(this.DRIVER
                    + ":" + this.URL);
        }
    }

    protected void disconnectDatabase() throws SQLException {
        if (!this.connection.isClosed()) {
            this.connection.close();
        }
    }
}
