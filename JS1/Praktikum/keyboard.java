package PBO_SMT_3.JS1.Praktikum;
public class keyboard {
    private String merek;
    private String jenis;


    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void tekanTombol() {
        System.out.println("Menekan tombol pada keyboard " + merek);
    }

    public void cetakInfo() {
        System.out.println("Keyboard: " + merek + ", Jenis: " + jenis);
    }
}
