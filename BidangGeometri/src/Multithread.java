import java.io.IOException;
import java.io.RandomAccessFile;
public class Multithread implements Runnable {
    private int randomNumber;
    private RandomAccessFile file;
    public Multithread(int randomNumber, RandomAccessFile file) {
        this.randomNumber = randomNumber;
        this.file = file;
    }

    @Override
    public void run() {
        System.out.println("Processing data: ");
        switch(randomNumber){
            case 1:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Tabung(7,5).hitungLuasPermukaan()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes( new Tabung(7,5).hitungVolume()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerucut(7,5,4).hitungLuasPermukaan()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerucut(7,5,4).hitungVolume()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Bola(7).hitungLuasPermukaan()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 6:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Bola(7).hitungVolume()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 7:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Juring(7).hitungLuasJuring()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 8:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Juring(7).hitungVolumeJuring()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 9:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Tembereng(7).hitungLuasTembereng()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 10:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Tembereng(7).hitungVolumeTembereng()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 11:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerutan(7,5).hitungLuasKerutan()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 12:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerutan(7,5).hitungVolumeKerutan()+""+"\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
