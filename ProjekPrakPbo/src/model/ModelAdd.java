package model;

import projectInterface.InterfaceAdd;

import javax.swing.*;

public class ModelAdd extends Connector implements InterfaceAdd {
    @Override
    public void inputJadwal(String nama, String durasi, String nomor_lapangan, String jamBooking){
        try{
            String querry = "INSERT INTO `data` (`nama`, `durasi`, `nomor_lapangan`, `jam_booking`)"+" VALUES ('" + nama + "','" + durasi + "','" + nomor_lapangan + "','" + jamBooking + "')";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diinput!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
