/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dzaki
 */
public class ViewAdd extends JFrame{
    private JTextField namaInput;
    private JTextField durasiInput;
    private JTextField bookingInput;
    private JButton hasil;
    private JButton hapus;

    public ViewAdd() {
        // Mengatur judul frame
        setTitle("NIKE FUTSAL SPORT");
        
        // Mengatur layout menjadi null
        setLayout(null);

        // Membuat komponen-komponen
        JLabel nameLabel = new JLabel("NIKE FUTSAL BOOKING");
        JLabel nameLabel2 = new JLabel("Burn Your Spirit Up !!");
        JLabel namaLabel = new JLabel("NAMA  :");
        JLabel durasiLabel = new JLabel("LAMA BOOKING[JAM] :");
        JLabel bookingLabel = new JLabel("LAPANGAN  :");
        namaInput = new JTextField();
        durasiInput = new JTextField();
        bookingInput = new JTextField();
        hasil = new JButton("INPUT");
        hapus = new JButton("HAPUS");
        

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
        namaInput.setBounds(540, 130, 200, 30);
        durasiInput.setBounds(540, 190, 200, 30);
        bookingInput.setBounds(540, 250, 200, 30);
        hasil.setBounds(380, 350, 100, 25);
        hapus.setBounds(550, 350, 100, 25);
        
        

        // Menambahkan komponen-komponen ke frame
        add(nameLabel);
        add(nameLabel2);
        add(namaLabel);
        add(durasiLabel);
        add(bookingLabel);
        add(namaInput);
        add(durasiInput);
        add(bookingInput);
        add(hasil);
        add(hapus);
//        add(nameTextField);
//        add(timeLabel);
//        add(timeComboBox);
//        add(reserveButton);

        // Mengatur action listener untuk tombol reservasi
//        reserveButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = nameTextField.getText();
//                String time = (String) timeComboBox.getSelectedItem();
//
//                // Melakukan tindakan reservasi (misalnya menampilkan pesan konfirmasi)
//                String message = "Reservasi berhasil!\n\n" +
//                        "Nama: " + name + "\n" +
//                        "Waktu: " + time;
//
//                JOptionPane.showMessageDialog(FutsalReservationUI.this, message, "Reservasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });

        // Menutup aplikasi ketika jendela ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur ukuran frame
//        setExtendedState(JFrame.MAXIMIZED_BOTH); 
//        setUndecorated(true);
        setSize(1000,500);
        // Menampilkan frame
        setVisible(true);
    }
}
