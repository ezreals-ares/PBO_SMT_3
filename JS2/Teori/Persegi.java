package PBO_SMT_3.JS2.Teori;

public class Persegi {

    int sisi;

    public Persegi (int sisi) {
        this.sisi = sisi;
    } 

    public void tampilSisi() {
        System.out.println("Panjang sisi: " + sisi);
    }

    public int luasPersegi() {
        int luas = sisi * sisi;
        return luas;
    }

    public int kelPersegi() {
        int keliling = 4 * sisi;
        return keliling;
    }

    public void tampilPersegi() {
        System.out.println("Luas persegi: " + luasPersegi());
        System.out.println("Keliling persegi: " + kelPersegi());
    }
}
