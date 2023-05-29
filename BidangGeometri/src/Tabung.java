public class Tabung extends Lingkaran {
    private double tinggi;
    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        double temp = 0;
        try{
            temp = 2*super.hitungLuas()+super.hitungKeliling()*tinggi;
            System.out.println("Luas Permukaan Tabung = "+temp);
        }catch(Exception e){
            System.out.println("Wrong input");
        }finally {
            return temp;
        }
    }

    public double hitungVolume() {
        double temp = 0;
        try{
            temp = super.hitungLuas()*tinggi;
            System.out.println("Volume Tabung = "+temp);
        }catch(Exception e){
            System.out.println("Wrong input");
        }finally {
            return temp;
        }
    }


}
