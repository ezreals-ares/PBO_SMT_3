package PBO_SMT_3.JS9;

public class GasStation {

     void isiBahanBakar(MobilKuno mobil, int bayar) {
        int hargaPerLiter = 5000;
        int liter = bayar / hargaPerLiter;
        System.out.println("Mobil tua diisi " + mobil.jenis + " sebanyak " + liter + " liter");
    }

     void isiBahanBakar(MobilMewah mobil, int bayar) {
        int hargaPerLiter = 10000;
        int liter = bayar / hargaPerLiter;
        System.out.println("Mobil mewah diisi " + mobil.jenis + " sebanyak " + liter + " liter");
    }
}