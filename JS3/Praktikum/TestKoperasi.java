package PBO_SMT_3.JS3.Praktikum;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota denny = new Anggota("111222333", "Denny", 5000000);

        System.out.println("Nama Anggota : " + denny.getNama());
        System.out.println("Limit Pinjaman : " + denny.getLimitinjaman());

        System.out.print("Masukkan nominal pinjaman: ");
        double pinjam = sc.nextDouble();
        denny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini : " + denny.getJumlahPinjaman());

        System.out.print("Masukkan angsuran: ");
        double angsur = sc.nextDouble();
        denny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + denny.getJumlahPinjaman());

        sc.close();
    }
}
