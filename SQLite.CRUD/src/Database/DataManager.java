package Database;

import java.sql.*;

public class DataManager extends DatabaseConnection {

    private Connection connection;

    public DataManager() {
        this.connection = null;
    }

    public void executeUpdate(String sql) throws SQLException {
        super.connectDatabase();
        this.connection = super.getConnection();
        this.connection.createStatement().executeUpdate(sql);
        super.disconnectDatabase();
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        super.connectDatabase();
        this.connection = super.getConnection();
        ResultSet searchData = this.connection.createStatement().executeQuery(sql);
        return searchData;
    }
    
    @Override
    public void disconnectDatabase() throws SQLException {
        super.disconnectDatabase();
    }
}
