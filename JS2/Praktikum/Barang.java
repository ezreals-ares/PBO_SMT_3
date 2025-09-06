package PBO_SMT_3.JS2.Praktikum;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public float hitungHargaJual () {
        float hargaJual = hargaDasar - (diskon * hargaDasar);
        return hargaJual;
    }

    public void tampilData () {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Jual: " + hitungHargaJual());
    }
}
