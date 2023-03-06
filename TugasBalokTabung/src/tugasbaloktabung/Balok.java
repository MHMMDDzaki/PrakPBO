/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbaloktabung;

/**
 *
 * @author dzaki
 */
public class Balok implements MenghitungRuang {
    int panjang, lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume(){
        double volume = panjang*lebar*tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2*(panjang*lebar+lebar*tinggi+panjang*tinggi);
        return luasPermukaan;
    }
}
