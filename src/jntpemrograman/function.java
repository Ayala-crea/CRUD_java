/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jntpemrograman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class function {

    private static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        try {
            var url = "jdbc:mysql://localhost:3306/jntpemograman";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal " + e.getMessage());
            e.printStackTrace(); // Print the stack trace
        }
        return mysqlconfig;
    }

}
