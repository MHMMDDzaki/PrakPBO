public class Juring extends Bola{
    public Juring(double jari) {
        super(jari);
    }

    public double hitungLuasJuring() {
        double temp = 0;
        try{
            temp = super.hitungKeliling()*super.getTinggiBola() + super.hitungKeliling()/2;
            System.out.println("Luas Juring = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }

    public double hitungVolumeJuring() {
        double temp = 0;
        try{
            temp = 2*super.hitungLuas()*super.getTinggiBola()/3;
            System.out.println("Volume Juring = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }
}
