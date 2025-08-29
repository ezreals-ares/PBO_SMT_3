package PBO_SMT_3.JS1.Praktikum;

public class smartphone {
    private String merek;
    private int kapasitasBaterai;

    public String getMerk() {
        return merek;
    }

    public void setMerk(String merk) {
        this.merek = merk;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void hidupkan() {
        System.out.println(merek + " sedang dinyalakan...");
    }

    public void matikan() {
        System.out.println(merek + " dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("HP: " + merek + " | Baterai: " + kapasitasBaterai + "mAh");
    }
}
