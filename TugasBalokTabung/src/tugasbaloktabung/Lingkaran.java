/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbaloktabung;

/**
 *
 * @author dzaki
 */
public class Lingkaran implements MenghitungBidang {
    int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }
    
    @Override
    public double hitungLuas() {
        double luas = Math.PI*jari*jari;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jari;
        return keliling;
    }
}
