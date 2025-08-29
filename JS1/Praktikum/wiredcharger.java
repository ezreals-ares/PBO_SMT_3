package PBO_SMT_3.JS1.Praktikum;

public class wiredcharger extends charger {

    private String tipeKabel;
    private String tipeSoket;

    public String getTipeKabel() {
        return tipeKabel;
    }

    public String tipeSoket() {
        return tipeSoket;
    }

    public void setTipeKabel(String tipeKabel) {
        this.tipeKabel = tipeKabel;
    }

    public void setTipeSoket(String tipeSoket) {
        this.tipeSoket = tipeSoket;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tipe Kabel: " + tipeKabel);
        System.out.println("Tipe Soket: " + tipeSoket);
    }
}
