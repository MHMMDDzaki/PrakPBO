/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsipbo;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Connector {
    Connection conn;
    Statement statement;
    
    public Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            System.out.println("Koneksi Berhasil");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Koneksi Gagal"+e);
        }
    }
    
    public int getBanyakData() {
        int jmlData = 0;
        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM dataperpus";
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
    
    public String[][] bookList(){
        int jmlData = 0;
        try{
            String[][] data = new String[getBanyakData()][20];
            String query = "select * from dataperpus";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("judul");
                data[jmlData][2] = resultSet.getString("genre");
                data[jmlData][3] = resultSet.getString("penulis");
                data[jmlData][4] = resultSet.getString("penerbit");
                data[jmlData][5] = resultSet.getString("lokasi");
                data[jmlData][6] = resultSet.getString("stock");
                jmlData++;
            }
            return data;
        }catch(SQLException e){
            return null;
        }
    }
    
    public void inputBook(String judul, String genre, String penulis, String penerbit, String lokasi, String stock){
        try{
            String querry = "INSERT INTO `dataperpus` (`judul`, `genre`, `penulis`,`penerbit`,`lokasi`,`stock`)"+" VALUES ('" + judul + "','" + genre + "','" + penulis + "','" + penerbit + "','" + lokasi + "','" + stock + "')";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diinput!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void updateBook(int id, String judul, String genre, String penulis, String penerbit, String lokasi, String stock){
        try{
            String querry = "UPDATE `dataperpus` SET judul='"+ judul +"', judul='"+ genre +"', penulis='"+ penulis +"', penerbit='"+ penerbit +"', lokasi='"+ lokasi +"', stock='"+ stock +"'" + "WHERE id='" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
            JOptionPane.showMessageDialog(null, "Data Berhasil diupdate!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void deleteBook(int id){
        try{
            String querry = "DELETE FROM `dataperpus` WHERE id='" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
