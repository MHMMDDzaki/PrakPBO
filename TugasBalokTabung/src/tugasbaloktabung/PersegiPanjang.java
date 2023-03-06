/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbaloktabung;

/**
 *
 * @author dzaki
 */
public class PersegiPanjang implements MenghitungBidang {
    int panjang,lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas(){
        double luas = panjang*lebar;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = (2*panjang)+(2*lebar);
        return keliling;
    }
}
