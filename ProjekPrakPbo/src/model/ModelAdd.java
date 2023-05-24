package model;

import javax.swing.*;

public class ModelAdd extends Connector {
    public void inputJadwal(String nama, String durasi, String nomor_lapangan){
        try{
            String querry = "INSERT INTO `data` (`nama`, `durasi`, `nomor_lapangan`)"+" VALUES ('" + nama + "','" + durasi + "','" + nomor_lapangan + "')";
            statement = conn.createStatement();
            statement.executeUpdate(querry);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diinput!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
