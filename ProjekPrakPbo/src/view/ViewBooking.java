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
    public JTable table;
    public DefaultTableModel tableModel;
    JLabel nameLabel = new JLabel("NIKE FUTSAL SPORT");
    public JButton addMenu = new JButton("ADD");;
    public JButton editDelete = new JButton("EDIT & DELETE");;
    // Membuat kolom-kolom tabel
    public Object[] judul = {"ID", "Nama", "Durasi","No. Lapangan","Tanggal Booking"};
    public ViewBooking() {
        setTitle("Tabel Modern");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLayout(null);

        // Membuat model tabel dengan kolom-kolom dan data yang telah ditentukan
        DefaultTableModel tableModel = new DefaultTableModel(judul,0);

        // Membuat objek JTable dengan model tabel
        table = new JTable(tableModel);
        table.setBounds(200, 80, 600, 280);
        nameLabel.setBounds(370, 20, 500, 55);
        nameLabel.setFont(new Font("Showcard Gothic", 3, 24));
        addMenu.setBounds(320, 380, 150, 25);
        editDelete.setBounds(530, 380, 150, 25);

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
        add(addMenu);
        add(editDelete);

        setVisible(true);
    }
}
