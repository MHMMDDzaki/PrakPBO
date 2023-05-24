/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;
import model.ModelEdel;

/**
 *
 * @author dzaki
 */
public class ViewEdel extends JFrame {
    // Membuat komponen-komponen
    ModelEdel listData = new ModelEdel();
    JLabel nameLabel = new JLabel("NIKE FUTSAL BOOKING");
    JLabel nameLabel2 = new JLabel("Edit & Delete Page");
    JLabel namaLabel = new JLabel("NAMA  :");
    String pilihLapangan[] = {"Nike-1", "Nike-2", "Nike-3", "Nike-4"};
    JComboBox list_lapangan = new JComboBox(pilihLapangan);
    JLabel lapanganLabel = new JLabel("LAPANGAN :");
    JLabel bookingLabel = new JLabel("LAMA BOOKING[JAM]  :");
    private JComboBox list_jadwal = new JComboBox(listData.ambilPilihan());
    private JTextField namaInput  = new JTextField();
    private JTextField bookingInput  = new JTextField();
    public JButton edit  = new JButton("EDIT DATA");
    public JButton delete  = new JButton("DELETE DATA");
    public JButton homeEdel = new JButton("HOME");

    public ViewEdel() {
        // Mengatur judul frame
        setTitle("NIKE FUTSAL SPORT");

        // Mengatur layout menjadi null
        setLayout(null);

        // Menentukan posisi dan ukuran komponen-komponen
        nameLabel.setBounds(370, 20, 500, 55);
        nameLabel.setFont(new Font("Showcard Gothic", 3, 24));
        nameLabel2.setBounds(440, 50, 200, 55);
        nameLabel2.setFont(new Font("Showcard Gothic", 3, 12));
        list_jadwal.setBounds(320, 120, 400, 25);
        namaLabel.setBounds(300, 160, 200, 55);
        namaLabel.setFont(new Font("Showcard Gothic", 1, 16));
        lapanganLabel.setBounds(300, 220, 200, 55);
        lapanganLabel.setFont(new Font("Showcard Gothic", 1, 16));
        bookingLabel.setBounds(300, 280, 230, 55);
        bookingLabel.setFont(new Font("Showcard Gothic", 1, 16));
        namaInput.setBounds(540, 170, 200, 30);
        list_lapangan.setBounds(540, 230, 200, 30);
        bookingInput.setBounds(540, 290, 200, 30);
        edit.setBounds(380, 370, 100, 25);
        delete.setBounds(550, 370, 100, 25);
        homeEdel.setBounds(870, 400, 75, 30);


        // Menambahkan komponen-komponen ke frame
        add(nameLabel);
        add(nameLabel2);
        add(namaLabel);
        add(lapanganLabel);
        add(bookingLabel);
        add(namaInput);
        add(list_lapangan);
        add(bookingInput);
        add(edit);
        add(delete);
        add(list_jadwal);
        add(homeEdel);

        // Menutup aplikasi ketika jendela ditutup
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Mengatur ukuran frame
        setSize(1000, 500);

        // Menampilkan frame
        setVisible(true);
    }

    public String getID() {
        String selectedID = (String) list_jadwal.getSelectedItem();
        return selectedID;
    }
    
    public String getEditNama() {
        return namaInput.getText();
    }
    
    public String getEditLapangan(){
        String lapanganInput = (String) list_lapangan.getSelectedItem();
        return lapanganInput;
    }
    
    public String getEditBooking(){
        return bookingInput.getText();
    }

}
