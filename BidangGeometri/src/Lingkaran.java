import java.sql.SQLOutput;

public class Lingkaran implements Geometri{
    private double jari;
    private double pi;

    public Lingkaran(double jari){
        this.jari = jari;
        this.pi = Math.PI;
    }

    public double getJari() {
        return jari;
    }

    public double getPi() {
        return pi;
    }

    public double getDiameter(){
        return jari*2;
    }

    @Override
    public double hitungKeliling() {
        double temp = 0;
        try {
            temp = 2 * pi * jari;
        } catch (Exception e) {
            System.out.println("Wrong input");
        } finally {
            return temp;
        }

    }

    @Override
    public double hitungLuas() {
        double temp = 0;
        try {
            temp = pi*jari*jari;
        }catch(Exception e){
            System.out.println("Wrong input");
        }finally {
            return temp;
        }

    }
}
