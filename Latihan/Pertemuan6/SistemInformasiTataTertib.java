package PBO_SMT_3.Latihan.Pertemuan6;

public class SistemInformasiTataTertib {
    private Pelanggaran[] daftarPelanggaran;
    private int jumlahData; 
    private int max = 100; 

    public SistemInformasiTataTertib() {
        this.daftarPelanggaran = new Pelanggaran[max];
        this.jumlahData = 0;
    }

    public void catatPelanggaran(Pelanggaran pelanggaran) {
        if (jumlahData < max) {
            daftarPelanggaran[jumlahData] = pelanggaran;
            jumlahData++;
            System.out.println("Pencatatan berhasil...");
        } else {
            System.out.println("Sistem penuh, pencatatan gagal!");
        }
    }

    public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
        System.out.println("\n--- Riwayat Pelanggaran untuk: " + anggota.getNama() + " ---");
        boolean ditemukan = false;
        
        for (int i = 0; i < jumlahData; i++) {
            Pelanggaran p = daftarPelanggaran[i];
            if (p.getPelanggaran().getId().equals(anggota.getId())) {
                System.out.println("Tanggal: " + p.getTanggal());
                System.out.println("Peraturan: " + p.getPeraturanDilanggar().getPeraturan());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada riwayat pelanggaran.");
        }
    }
}
