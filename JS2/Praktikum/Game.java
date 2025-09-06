package PBO_SMT_3.JS2.Praktikum;

public class Game {

    public String idGame;
    public String namaGame;
    public double hargaPerhari;

    public Game(String idGame, String namaGame, double hargaPerhari) {
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.hargaPerhari = hargaPerhari;
    }

    public double getHargaPerhari () {
        return hargaPerhari;
    }

    public String getNamaGame () {
        return namaGame;
    }

}
