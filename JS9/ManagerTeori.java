package PBO_SMT_3.JS9;

public class ManagerTeori {
    protected String nama;
    protected int gaji;

    public ManagerTeori(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        gaji += 1000000;
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
