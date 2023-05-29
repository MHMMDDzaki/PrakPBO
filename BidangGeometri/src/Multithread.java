import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.*;

public class Multithread extends Connector implements Runnable {
    private int randomNumber;
    private RandomAccessFile file;
    public Multithread(int randomNumber, RandomAccessFile file) {
        this.randomNumber = randomNumber;
        this.file = file;
    }

    @Override
    public void run() {
        // Prepare the statement
        String sql = "INSERT INTO data (value) VALUES (?)";
        PreparedStatement statement = null;

        System.out.println("Processing data: ");
        switch(randomNumber){
            case 1:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Tabung(7,5).hitungLuasPermukaan()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Tabung(7,5).hitungLuasPermukaan()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes( new Tabung(7,5).hitungVolume()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Tabung(7,5).hitungVolume()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 3:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerucut(7,5,4).hitungLuasPermukaan()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Kerucut(7,5,4).hitungLuasPermukaan()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 4:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerucut(7,5,4).hitungVolume()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Kerucut(7,5,4).hitungVolume()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 5:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Bola(7).hitungLuasPermukaan()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Bola(7).hitungLuasPermukaan()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 6:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Bola(7).hitungVolume()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Bola(7).hitungVolume()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 7:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Juring(7).hitungLuasJuring()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Juring(7).hitungLuasJuring()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 8:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Juring(7).hitungVolumeJuring()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Juring(7).hitungVolumeJuring()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 9:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Tembereng(7).hitungLuasTembereng()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Tembereng(7).hitungLuasTembereng()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                }  catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 10:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Tembereng(7).hitungVolumeTembereng()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Tembereng(7).hitungVolumeTembereng()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 11:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerutan(7,5).hitungLuasKerutan()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Kerutan(7,5).hitungLuasKerutan()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 12:
                try {
                    synchronized (file) {
                        // Seek to the end of the file
                        file.seek(file.length());
                        // Write the data to the file
                        file.writeBytes(new Kerutan(7,5).hitungVolumeKerutan()+""+"\r\n");
                        statement = conn.prepareStatement(sql);
                        statement.setString(1, new Kerutan(7,5).hitungVolumeKerutan()+"");

                        statement.executeUpdate();
                        statement.close();
                    }
                } catch (IOException | SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
        }

    }
}
