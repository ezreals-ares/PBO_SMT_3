package PBO_SMT_3.JS9;

public class Manager extends Karyawaan {
    private double tunjangan;
    private String bagian;
    private Staff sf[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public double getTunjangan() {
        return tunjangan;
    }
    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
    public String getBagian() {
        return bagian;
    }
    public void setSf(Staff[] sf) {
        this.sf = sf;
    }
    public void viewStaff() {
        int i;
        System.out.println("-----------------------");
        for (i = 0; i < sf.length; i++) {
            sf[i].lihatInfo();
        }
        System.out.println("-----------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager     : " + this.getBagian());
        System.out.println("NIP         : " + this.getNip());
        System.out.println("Nama        : " + this.getNama());
        System.out.println("Golongan    : " + this.getGolongan());
        System.out.printf("Tunjangan   : %.0f\n", this.getTunjangan());
        System.out.printf("Gaji        : %.0f\n", this.getGaji());
        System.out.println("Bagian      : " + this.getBagian());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
