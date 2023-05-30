/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsipbo;

import java.awt.*;
import static java.lang.Integer.parseInt;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Gui extends JFrame {
    Connector conn = new Connector();
    
    JLabel labelTitle = new JLabel("PERPUSTAKAAN UMUM YOGYAKARTA");
    JLabel labelId = new JLabel("ID");
    JLabel labelJudul = new JLabel("JUDUL BUKU");
    JLabel labelGenre = new JLabel("GENRE BUKU");
    JLabel labelPenulis = new JLabel("PENULIS BUKU");
    JLabel labelPenerbit = new JLabel("PENERBIT BUKU");
    JLabel labelLokasi = new JLabel("LOKASI BUKU");
    JLabel labelStok = new JLabel("STOCK BUKU");
    private JTextField inputId = new JTextField();
    private JTextField inputJudul = new JTextField();
    private JTextField inputGenre = new JTextField();
    private JTextField inputPenulis = new JTextField();
    private JTextField inputPenerbit = new JTextField();
    private JTextField inputLokasi = new JTextField();
    private JTextField inputStok = new JTextField();
    JButton tambah = new JButton("TAMBAH");
    JButton ubah = new JButton("UBAH");
    JButton hapus = new JButton("HAPUS");
    JButton tampilkanSemua = new JButton("TAMPILKAN SEMUA");
    
    JTable table;
    DefaultTableModel tableModel;
    
    String[][] dataTabel = conn.bookList();
    
    public Object[] judul = {"ID", "Judul", "Genre","Penulis","Penerbit","Lokasi","Stock"};
    
    public Gui() {
        setTitle("RESPONSI");
        setLayout(null);
        setSize(1300,600);
        
        DefaultTableModel tableModel = new DefaultTableModel(judul,0);
        
        labelTitle.setBounds(60, 25, 700, 25);
        labelTitle.setFont(new Font("Times New Roman",1,19));
        labelId.setBounds(20, 90, 150, 25);
        labelId.setFont(new Font("Times New Roman",1,15));
        labelJudul.setBounds(20, 120, 150, 25);
        labelJudul.setFont(new Font("Times New Roman",1,15));
        labelGenre.setBounds(20, 150, 150, 25);
        labelGenre.setFont(new Font("Times New Roman",1,15));
        labelPenulis.setBounds(20, 180, 150, 25);
        labelPenulis.setFont(new Font("Times New Roman",1,15));
        labelPenerbit.setBounds(20, 210, 150, 25);
        labelPenerbit.setFont(new Font("Times New Roman",1,15));
        labelLokasi.setBounds(20, 240, 150, 25);
        labelLokasi.setFont(new Font("Times New Roman",1,15));
        labelStok.setBounds(20, 270, 150, 25);
        labelStok.setFont(new Font("Times New Roman",1,15));
        
        inputId.setBounds(200, 90,150,25);
        inputId.setEditable(false);
        inputJudul.setBounds(200, 120,150,25);
        inputGenre.setBounds(200, 150,150,25);
        inputPenulis.setBounds(200, 180,150,25);
        inputPenerbit.setBounds(200, 210,150,25);
        inputLokasi.setBounds(200, 240,150,25);
        inputStok.setBounds(200, 270,150,25);
        
        table = new JTable(tableModel);
        table.setModel((new JTable(dataTabel, judul)).getModel());
        table.setBounds(600, 80, 600, 280);

        // Mengatur warna latar belakang dan warna teks pada sel-sel tabel
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);

        // Mengatur warna latar belakang header kolom
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);

        // Menambahkan tabel ke dalam JScrollPane agar dapat di-scroll
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(600, 80, 600, 280);
        
        tambah.setBounds(380,90,150,50);
        ubah.setBounds(380,150,150,50);
        hapus.setBounds(380,210,150,50);
        tampilkanSemua.setBounds(380,270,150,50);
        
        add(labelTitle);
        add(labelId);
        add(labelJudul);
        add(labelGenre);
        add(labelPenulis);
        add(labelPenerbit);
        add(labelLokasi);
        add(labelStok);
        
        add(inputId);
        add(inputJudul);
        add(inputGenre);
        add(inputPenulis);
        add(inputPenerbit);
        add(inputLokasi);
        add(inputStok);
        
        add(scrollPane);
        
        add(tambah);
        add(ubah);
        add(hapus);
        add(tampilkanSemua);
        
        tambah.addActionListener(e -> {
            conn.inputBook(inputJudul.getText(), inputGenre.getText(), inputPenulis.getText(), inputPenerbit.getText(), inputLokasi.getText(), inputStok.getText());
        });
        
        ubah.addActionListener(e -> {
            conn.updateBook(parseInt(inputId.getText()), inputJudul.getText(), inputGenre.getText(), inputPenulis.getText(), inputPenerbit.getText(), inputLokasi.getText(), inputStok.getText());
        });
        
        hapus.addActionListener(e->{
            conn.deleteBook(parseInt(inputId.getText()));
        });
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
