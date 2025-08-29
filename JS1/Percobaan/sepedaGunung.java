package PBO_SMT_3.JS1.Percobaan;

public class sepedaGunung extends sepeda {
    
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Suspensi: " + tipeSuspensi);
    }
}
