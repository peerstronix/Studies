package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    //  To connect to a database we need USERNAME, PASSWORD and a LINK to the database we want to connect to
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    private static final String CON_LINK = "";

    //Don't forget to load JDBC driver into your project structure


    //  Method to get DATABASE connect
    private static Connection connectionToDB() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(CON_LINK, USERNAME, PASSWORD);

        }catch (SQLException e){

            e.printStackTrace();

        }

        return connection;
    }
}
