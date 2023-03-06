/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbaloktabung;

/**
 *
 * @author dzaki
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    int jari,tinggi;

    public Tabung(int jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume(){
        double volume = Math.PI*jari*jari*tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = (2*Math.PI*jari*tinggi)+(2*Math.PI*jari*jari);
        return luasPermukaan;
    }
    
}
