package PBO_SMT_3.JS2.Praktikum;

public class Peminjaman {

    public String idPeminjaman;
    public Member member;
    public Game game;
    public int lamaSewa;
    public double totalBayar;

    public Peminjaman(String idPeminjaman, Member member, Game game, int lamaSewa) {
        this.idPeminjaman = idPeminjaman;
        this.member = member;
        this.game = game;
        this.lamaSewa = lamaSewa;
        this.totalBayar = hitungTotalBayar();
    }

    public double hitungTotalBayar() {
        return lamaSewa * game.getHargaPerhari();
    }

    public void tampilkanDataPeminjaman() {
        System.out.println("ID peminjaman : " + idPeminjaman);
        System.out.println("Nama Member : " + member.getNamaMember());
        System.out.println("Nama Game : " + game.getNamaGame());
        System.out.println("Harga Perhari : " + game.getHargaPerhari());
        System.out.println("Lama Sewa : " + + lamaSewa + " hari");
        System.out.println("Total bayar" + "Rp" + hitungTotalBayar());

    }
}