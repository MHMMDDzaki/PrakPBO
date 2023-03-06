/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbaloktabung;

import java.util.Scanner;

/**
 *
 * @author dzaki
 */
public class TugasBalokTabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilihan,ulangi = 0,inpPanjang,inpLebar,inpTinggi,inpJari;
        do{
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner inputPanjang = new Scanner(System.in);
        Scanner inputLebar = new Scanner(System.in);
        Scanner inputTinggi = new Scanner(System.in);
        Scanner inputJari = new Scanner(System.in);
        
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        
        if(pilihan == 1){
            System.out.print("Input Panjang : ");
            inpPanjang = inputPanjang.nextInt();
            System.out.print("Input Lebar : ");
            inpLebar = inputLebar.nextInt();
            System.out.print("Input Tinggi : ");
            inpTinggi = inputTinggi.nextInt();
            
            MenghitungBidang persegiPanjang = new PersegiPanjang(inpPanjang,inpLebar);
            MenghitungRuang balok = new Balok(inpPanjang,inpLebar, inpTinggi);
            
            System.out.println("Luas Persegi Panjang = "+ persegiPanjang.hitungLuas());
            System.out.println("Keliling Persegi Panjang = "+ persegiPanjang.hitungKeliling());
            System.out.println("Volume Balok = "+ balok.hitungVolume());
            System.out.println("Luas Permukaan Balok = "+ balok.hitungLuasPermukaan());
            System.out.println("Ulangi? (Ya: 1 || Tidak: 0)");
            ulangi = input2.nextInt();
        } else if(pilihan == 2){
            System.out.print("Input Jari : ");
            inpJari = inputJari.nextInt();
            System.out.print("Input Tinggi : ");
            inpTinggi = inputTinggi.nextInt();
            
            MenghitungBidang lingkaran = new Lingkaran(inpJari);
            MenghitungRuang tabung = new Tabung(inpJari, inpTinggi);
            
            System.out.println("Luas Lingkaran = "+ lingkaran.hitungLuas());
            System.out.println("Keliling Lingkaran = "+ lingkaran.hitungKeliling());
            System.out.println("Volume Tabung = "+ tabung.hitungVolume());
            System.out.println("Luas Permukaan Tabung = "+ tabung.hitungLuasPermukaan());
            System.out.println("Ulangi? (Ya: 1 || Tidak: 0)");
            ulangi = input2.nextInt();
        }
        }while(ulangi != 0 && pilihan != 0);
    }
    
}
