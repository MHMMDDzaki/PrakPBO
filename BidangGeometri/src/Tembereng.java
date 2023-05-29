public class Tembereng extends Bola{
    public Tembereng(double jari) {
        super(jari);
    }

    public double hitungLuasTembereng(){
        double temp = 0;
        try{
            temp = super.hitungKeliling()*super.getTinggiBola();
            System.out.println("Luas Tembereng = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally {
            return temp;
        }
    }
    public double hitungVolumeTembereng(){
        double temp = 0;
        try{
            temp = (super.hitungKeliling()/2*super.getTinggiBola()*super.getTinggiBola())-(super.getPi()*super.getTinggiBola()*super.getTinggiBola()*super.getTinggiBola()/3);
            System.out.println("Volume Tembereng = "+temp);
        }catch(Exception e){
            System.out.println("Wrong Input");
        }finally{
            return temp;
        }
    }
}
