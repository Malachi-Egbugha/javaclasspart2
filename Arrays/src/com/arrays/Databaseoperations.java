package com.arrays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Databaseoperations {
    String url;
    String username;
    String password;

    public Databaseoperations(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    public Connection Databaseconnection (){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.url, this.username, this.password);
           
           
        }
        catch(SQLException e){
            e.printStackTrace();
        }


        //Connection conn1 = conn;
        return conn;
    }
}
