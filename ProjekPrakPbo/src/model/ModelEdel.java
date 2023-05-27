/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import projectInterface.InterfaceEdel;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dzaki
 */
public class ModelEdel extends Connector implements InterfaceEdel {
    String[] pilihan = new String[20];
    @Override
    public String[] ambilPilihan(){
        int jmlData = 0;
        try{
            // Membuat statement SQL
            String querry = "SELECT `id`,`nama` FROM data";
            statement = conn.createStatement();

            // Menjalankan query SQL
            ResultSet resultSet = statement.executeQuery(querry);

            // Mendapatkan data dari ResultSet dan menambahkannya ke JComboBox
            while (resultSet.next()) {
                pilihan[jmlData] = resultSet.getString("id") + " - " + resultSet.getString("nama");
                jmlData++;
            }
            return pilihan;
        }catch(Exception e){
            System.out.println("Error");    
            return null;
            
        }
    }
    
    @Override
    public void updateJadwal(String name, String durasi, String nomor_lapangan, String jamBooking, int id){
        try{
            String querry = "UPDATE `data` SET nama='"+ name +"', durasi='"+ durasi +"', nomor_lapangan='"+ nomor_lapangan +"', jam_booking='"+ jamBooking +"'" + "WHERE id='" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
            JOptionPane.showMessageDialog(null, "Data Berhasil diupdate!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void deleteJadwal(int id){
        try{
            String querry = "DELETE FROM `data` WHERE id='" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
