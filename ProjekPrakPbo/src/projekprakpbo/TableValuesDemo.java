/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekprakpbo;

/**
 *
 * @author dzaki
 */
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TableValuesDemo {

    Connection con;
    Statement statement;
    String data[][] = new String[100][2];
    String pilihan[] = new String[20];

    public TableValuesDemo() {
        try {      
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/booking_futsal", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Berhasil" + e.getMessage());
        } 
    }
    
    public String[][] bookingList(){
        int jmlData = 0;
        try{
            String[][] data = new String[getBanyakData()][5];
            String query = "select * from data";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("durasi");
                data[jmlData][3] = resultSet.getString("nomor_lapangan");
                data[jmlData][4] = resultSet.getString("tanggal_booking");
                System.out.println(resultSet.getString("nama"));
                jmlData++;
            }
            return data;
        }catch(SQLException e){
            return null;
        }
 
    }
    
    public void inputJadwal(String nama, String durasi, String nomor_lapangan){
        try{
            String querry = "INSERT INTO `data` (`nama`, `durasi`, `nomor_lapangan`)"+" VALUES ('" + nama + "','" + durasi + "','" + nomor_lapangan + "')";
            statement = con.createStatement();
            statement.executeUpdate(querry);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void updateJadwal(String name, String durasi, String nomor_lapangan, int id){
        try{
            String querry = "UPDATE `data` SET nama='"+ name +"', durasi='"+durasi+"', nomor_lapangan='"+ nomor_lapangan +"'" + "WHERE id='" + id + "'";
            statement = con.createStatement();
            statement.executeUpdate(querry);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void deleteJadwal(int id){
        try{
            String querry = "DELETE FROM `data` WHERE id='" + id + "'";
            statement = con.createStatement();
            statement.executeUpdate(querry);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public String[] ambilPilihan(){
        int jmlData = 0;
        try{
            // Membuat statement SQL
            String querry = "SELECT `id` FROM data";
            statement = con.createStatement();

            // Menjalankan query SQL
            ResultSet resultSet = statement.executeQuery(querry);

            // Mendapatkan data dari ResultSet dan menambahkannya ke JComboBox
            while (resultSet.next()) {
                pilihan[jmlData] = resultSet.getString("id");  
            }
            return pilihan;
        }catch(Exception e){
            System.out.println("Error");    
            return null;
            
        }
    }
    
    
    public int getBanyakData() {
        int jmlData = 0;
        try {
            statement = con.createStatement();
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
