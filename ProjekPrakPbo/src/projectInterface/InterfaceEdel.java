package projectInterface;

public interface InterfaceEdel {
    String[] ambilPilihan();
    void updateJadwal(String name, String duration, String field_number, String booking_time, int id);
    void deleteJadwal(int id);
}
