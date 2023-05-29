public class Kerutan extends Bola{
    private double jari2;
    public Kerutan(double jari, double jari2) {
        super(jari);
        this.jari2 = jari2;
    }
    public double hitungLuasKerutan() {
        double temp = 0;
        try{
            temp = super.hitungKeliling()*super.getTinggiBola();
            System.out.println("Luas Kerutan = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }

    public double hitungVolumeKerutan(){
        double temp = 0;
        try{
            temp = (super.hitungLuas()/2)+(super.getPi()*jari2*jari2/2)+(super.getPi()*super.getTinggiBola()*super.getTinggiBola()*super.getTinggiBola()/6);
            System.out.println("Volume Kerutan = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }
}
