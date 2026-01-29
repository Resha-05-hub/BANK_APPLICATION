package com.wipro.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static Connection getDBConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@localhost:1521:xe";
            String USER = "SYSTEM";
            String PASSWORD = "System123";

            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getConnection() {
        return getDBConnection();
    }
}