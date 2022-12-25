package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

interface DbHelperInterface{
    String userName="root";
    String password="sql123";
    String dbUrl="jdbc:mysql://localhost:3306/ucus";
}

public class DbHelper implements DbHelperInterface{

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);

    }

    public void ShowErrorMessage(SQLException exception) {
        System.out.println("Error:" + exception.getMessage());
    }
}
