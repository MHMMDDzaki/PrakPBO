/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dzaki
 */
public class ModelEdel extends Connector {
    String pilihan[] = new String[20];
    public ModelEdel() {
    
    }
    public String[] ambilPilihan(){
        int jmlData = 0;
        try{
            // Membuat statement SQL
            String querry = "SELECT `id` FROM data";
            statement = conn.createStatement();

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
    
    public void updateJadwal(String name, String durasi, String nomor_lapangan, int id){
        try{
            String querry = "UPDATE `data` SET nama='"+ name +"', durasi='"+ durasi +"', nomor_lapangan='"+ nomor_lapangan +"'" + "WHERE id='" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
            
            System.out.println("Berhasil diupdate");
            JOptionPane.showMessageDialog(null, "Data Berhasil diupdate!");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void deleteJadwal(int id){
        try{
            String querry = "DELETE FROM `data` WHERE id='" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
