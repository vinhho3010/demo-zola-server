package com.zola.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;
    private String server;
    private String port;
    private String database;
    private String userName;
    private String password;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {
      server = "localhost";
      port = "3306";
      database = "chat_application";
      userName = "root1";
      password = "123";
    }

    public void connectToDatabase() throws SQLException {
      
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
