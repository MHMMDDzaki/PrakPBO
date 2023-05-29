public class Bola extends Lingkaran {
    public Bola(double jari) {
        super(jari);
    }

    public double hitungLuasPermukaan() {
        double temp = 0;
        try{
            temp = 4*super.hitungLuas();
            System.out.println("Luas Permukaan Bola = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }

    public double hitungVolume() {
        double temp = 0;
        try{
            temp = 4*super.hitungLuas()*super.getJari()/3;
            System.out.println("Volume Bola = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }

    public double getTinggiBola() {
        return super.getDiameter();
    }
}
