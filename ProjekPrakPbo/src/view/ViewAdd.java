/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author dzaki
 */
public class ViewAdd extends JFrame{
    JLabel nameLabel = new JLabel("NIKE FUTSAL BOOKING");
    JLabel nameLabel2 = new JLabel("Burn Your Spirit Up !!");
    JLabel namaLabel = new JLabel("NAMA  :");
    JLabel durasiLabel = new JLabel("LAMA BOOKING[JAM] :");
    JLabel jamBookingLabel = new JLabel("JAM BOOKING :");
    JLabel bookingLabel = new JLabel("LAPANGAN  :");
    private JTextField namaInput = new JTextField();
    private JTextField durasiInput = new JTextField();
    private JTextField jamBookingInput = new JTextField();
    String inputLapangan[] = {"Nike-1", "Nike-2", "Nike-3", "Nike-4"};
    JComboBox listLapangan = new JComboBox(inputLapangan);
    public JButton hasil = new JButton("INPUT");
    public JButton hapus = new JButton("HAPUS");
    public JButton homeAdd = new JButton("HOME");

    public ViewAdd() {
        // Mengatur judul frame
        setTitle("NIKE FUTSAL SPORT");
        
        // Mengatur layout menjadi null
        setLayout(null);

        // Menentukan posisi dan ukuran komponen-komponen
        nameLabel.setBounds(370, 20, 500, 55);
        nameLabel.setFont(new Font("Showcard Gothic", 3, 24));
        nameLabel2.setBounds(440, 50, 200, 55);
        nameLabel2.setFont(new Font("Showcard Gothic", 3, 12));
        namaLabel.setBounds(300, 120, 200, 55);
        namaLabel.setFont(new Font("Showcard Gothic", 1, 16));
        durasiLabel.setBounds(300, 180, 200, 55);
        durasiLabel.setFont(new Font("Showcard Gothic", 1, 16));
        bookingLabel.setBounds(300, 240, 230, 55);
        bookingLabel.setFont(new Font("Showcard Gothic", 1, 16));
        jamBookingLabel.setBounds(300, 300, 230, 55);
        jamBookingLabel.setFont(new Font("Showcard Gothic", 1, 16));
        namaInput.setBounds(540, 130, 200, 30);
        durasiInput.setBounds(540, 190, 200, 30);
        listLapangan.setBounds(540, 250, 200, 30);
        jamBookingInput.setBounds(540, 310, 200, 30);

        hasil.setBounds(380, 380, 100, 25);
        hapus.setBounds(550, 380, 100, 25);
        homeAdd.setBounds(870, 400, 75, 30);

        // Menambahkan komponen-komponen ke frame
        add(nameLabel);
        add(nameLabel2);
        add(namaLabel);
        add(durasiLabel);
        add(bookingLabel);
        add(jamBookingLabel);
        add(namaInput);
        add(durasiInput);
        add(listLapangan);
        add(jamBookingInput);
        add(hasil);
        add(hapus);
        add(homeAdd);

        // Menutup aplikasi ketika jendela ditutup
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Mengatur ukuran frame
        setSize(1000,500);

        // Menampilkan frame
        setVisible(true);
    }
    public String getNamaInput() {
        return namaInput.getText();
    }

    public String getDurasiInput() {
        return durasiInput.getText();
    }

    public String getListLapangan() {
        String inputLapangan = (String) listLapangan.getSelectedItem();
        return inputLapangan;
    }

    public String getJamBooking() { return jamBookingInput.getText(); }

    public void setNamaInput() {
        namaInput.setText("");
    }

    public void setDurasiInput() {
        durasiInput.setText("");
    }

    public void setJamBookingInput() {
        jamBookingInput.setText("");
    }
}
