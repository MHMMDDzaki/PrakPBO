public class Kerucut extends Lingkaran implements Geometri{
    private double tinggi;
    private double sisi;
    public Kerucut(double jari, double tinggi, double sisi) {
        super(jari);
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double hitungLuasPermukaan() {
        double temp = 0;
        try{
            temp = super.hitungLuas()+super.hitungKeliling()/2*sisi;
            System.out.println("Luas Permukaan Kerucut = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }

    public double hitungVolume() {
        double temp = 0;
        try{
            temp = super.hitungLuas()*tinggi/3;
            System.out.println("Volume Kerucut = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }
}
