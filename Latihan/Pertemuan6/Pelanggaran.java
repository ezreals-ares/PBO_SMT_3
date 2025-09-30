package PBO_SMT_3.Latihan.Pertemuan6;

public class Pelanggaran {
    AnggotaKampus pelanggaran;
    TataTertib peraturanDilanggar;
    String tanggal;

    Pelanggaran(AnggotaKampus pelanggaran, TataTertib peraturanDilanggar, String tanggal) {
        this.pelanggaran = pelanggaran;
        this.peraturanDilanggar = peraturanDilanggar;
        this.tanggal = tanggal;
    }

    public AnggotaKampus getPelanggaran() {
        return pelanggaran;
    }

    public TataTertib getPeraturanDilanggar() {
        return peraturanDilanggar;
    }

    public String getTanggal() {
        return tanggal;
    }

}
