package PBO_SMT_3.Latihan.Pertemuan6;

public class Main {
    public static void main(String[] args) {
      
        SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();

        
        Mahasiswa mhs1 = new Mahasiswa("Budi Hartono", "MHS001", "21515020", "Teknik Informatika");
        Dosen dsn1 = new Dosen("Dr. Siti Aminah", "DSN001", "1985030320", "Ilmu Komputer");

        
        TataTertib aturan1 = new TataTertib("Dilarang merokok di area kampus", "Teguran lisan");
        TataTertib aturan2 = new TataTertib("Terlambat mengumpulkan tugas", "Pengurangan nilai");

     
        System.out.println("--- MENCATAT PELANGGARAN ---");
        Pelanggaran p1 = new Pelanggaran(mhs1, aturan2, "2025-09-28");
        sistem.catatPelanggaran(p1);

        Pelanggaran p2 = new Pelanggaran(dsn1, aturan1, "2025-09-29");
        sistem.catatPelanggaran(p2);
        
        Pelanggaran p3 = new Pelanggaran(mhs1, aturan1, "2025-09-30");
        sistem.catatPelanggaran(p3);

        
        sistem.lihatRiwayatPelanggaran(mhs1);
        sistem.lihatRiwayatPelanggaran(dsn1);
        
       
        System.out.println("\n--- PENERAPAN SANKSI ---");
        aturan1.terapkanSanksi(mhs1);
    }
}
