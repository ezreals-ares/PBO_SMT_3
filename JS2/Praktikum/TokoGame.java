package PBO_SMT_3.JS2.Praktikum;

public class TokoGame {

    public static void main(String[] args) {
        Member member1 = new Member("M001", "Doni");
        Game game1 = new Game("G001", "FIFA 24", 10000);
        Peminjaman peminjaman1 = new Peminjaman("P001", member1, game1, 3);

        peminjaman1.tampilkanDataPeminjaman();
    }
}