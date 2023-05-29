import java.sql.*;
public class Connector {
    Connection conn;

    public Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bidang_geometri", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi gagal" + e.getMessage());
        }
    }
}
