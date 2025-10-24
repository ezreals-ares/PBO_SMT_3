package PBO_SMT_3.JS9;

public class SalesManager extends ManagerTeori{
    private String departemen;

    public SalesManager(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    @Override
    public void naikkanGaji() {
        gaji += 1000000; 
    }

    @Override
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
    
}