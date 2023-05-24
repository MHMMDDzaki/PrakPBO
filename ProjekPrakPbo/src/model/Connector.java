/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;

/**
 *
 * @author dzaki
 */
public class Connector {
    Connection conn;
    Statement statement;
    
    public Connector(){
    try {      
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/booking_futsal", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Berhasil" + e.getMessage());
        } 
    }
    
    public int getBanyakData() {
        int jmlData = 0;
        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM data";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            return jmlData;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL error");
            return 0;
        }
    }
}
