package PBO_SMT_3.JS3.Praktikum;

public class Anggota {

    private String noKTP;
    private String namaAnggota;
    private double limitPinjaman;
    private double jumlahPinjaman;

    Anggota(String noKTP, String namaAnggota, double limitPinjaman) {
        this.noKTP = noKTP;
        this.namaAnggota = namaAnggota;
        this.limitPinjaman = limitPinjaman;
        jumlahPinjaman = 0;
    }

    public String getNama() {
        return namaAnggota;
    }

    public String getKTP() {
        return noKTP;
    }

    public double getLimitinjaman() {
        return limitPinjaman;
    }

    public void pinjam(double pinjaman) {
        if(pinjaman > limitPinjaman) {
            System.out.println("Maaf Jumlah Pinjaman Melebihi Limit");
            return;
        }
        jumlahPinjaman += pinjaman;
        limitPinjaman -= pinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void angsur(double angsuran) {
        double minimAngsur = jumlahPinjaman * 0.1;
        if(angsuran < minimAngsur) {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
            return;
        }
        jumlahPinjaman -= angsuran;
    }


}