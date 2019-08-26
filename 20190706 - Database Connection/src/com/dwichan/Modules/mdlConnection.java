/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwichan.Modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dwi Candra Permana
 */
public class mdlConnection {
    private static Connection conn;
    
    private String dbName = "dbMahasiswa";
    private String username = "root";
    private String password = "";
    
    public Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Failed to connect to db!\nExceptions: " + e.getMessage());
        } 
        return conn;
    }
    
    public boolean checkConnections() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            return false;
        } 
        return true;
    }
    
}
