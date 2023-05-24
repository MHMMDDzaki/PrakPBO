package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelBooking extends Connector{
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
                jmlData++;
            }
            return data;
        }catch(SQLException e){
            return null;
        }
    }
}
