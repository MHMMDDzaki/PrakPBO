/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author dzaki
 */
public class ViewBooking extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton edit;
    private JButton delete;

    public ViewBooking() {
        setTitle("Tabel Modern");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLayout(null);

        // Membuat kolom-kolom tabel
        String[] columns = {"ID", "Nama", "Durasi","No. Lapangan","Tanggal Booking"};
        
        // Data baris untuk tabel
        Object[][] data = {
            {"John Doe", "25", "Jl. Sudirman No. 123"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            {"Jane Smith", "30", "Jl. Gatot Subroto No. 456"},
            
        };
        
        JLabel nameLabel = new JLabel("NIKE FUTSAL SPORT");
        edit = new JButton("ADD");
        delete = new JButton("EDIT & DELETE");

        // Membuat model tabel dengan kolom-kolom dan data yang telah ditentukan
        DefaultTableModel tableModel = new DefaultTableModel(data, columns);

        // Membuat objek JTable dengan model tabel
        table = new JTable(tableModel);
        table.setBounds(200, 80, 600, 280);
        
        nameLabel.setBounds(370, 20, 500, 55);
        nameLabel.setFont(new Font("Showcard Gothic", 3, 24));
        edit.setBounds(320, 380, 150, 25);
        delete.setBounds(530, 380, 150, 25);

        // Mengatur warna latar belakang dan warna teks pada sel-sel tabel
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);

        // Mengatur warna latar belakang header kolom
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);

        // Menambahkan tabel ke dalam JScrollPane agar dapat di-scroll
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(200, 80, 600, 280);

        // Menambahkan JScrollPane ke frame
        add(nameLabel);
        add(scrollPane);
        add(edit);
        add(delete);

        setVisible(true);
    }
}
