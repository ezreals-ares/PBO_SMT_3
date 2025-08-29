package PBO_SMT_3.JS1.Praktikum;

public class charger {

    private String merek;
    private int daya;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getDaya() {
        return daya;
    }

    public void setDaya(int daya) {
        this.daya = daya;
    }

    public void isiDaya() {
        System.out.println("Mengisi daya menggunakan charger merek " + merek);
    }

    public void cetakInfo() {
        System.out.println("Merek: " + merek + ", Daya: " + daya + "W");
    }
}
