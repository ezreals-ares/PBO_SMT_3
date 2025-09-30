package PBO_SMT_3.Latihan.Pertemuan6;

public class TataTertib {

    String peraturan;
    String sanksi;

    TataTertib(String peraturan, String sanksi) {
        this.peraturan = peraturan;
        this.sanksi = sanksi;
    }

    public String getPeraturan() {
        return peraturan;
    }

    public String getSanksi() {
        return sanksi;
    }

    void terapkanSanksi(AnggotaKampus anggota) {
        System.out.println(anggota.getNama() + " Melanggar peraturan: " + peraturan + " dan terkena sanksi: " + sanksi);
    }
}