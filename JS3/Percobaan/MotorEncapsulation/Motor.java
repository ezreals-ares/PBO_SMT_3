package PBO_SMT_3.JS3.Percobaan.MotorEncapsulation;

public class Motor {
    
    private int kecepatan = 0;
    private boolean kontak0n = false;
    public int kecepatanMax = 100;
    
    
    public void tambahKecepatan() {
        if (kecepatan >= kecepatanMax) {
            System.out.println("kecepatan sudah maksimal");
            return;
        }
        if(kontak0n == true) {
            kecepatan+= 50;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }
    public void nyalakanMesin() {
        kontak0n = true;
    }
    
    public void matikanMesin() {
        kontak0n = false;
        kecepatan = 0;
    }
    

    public void kurangiKecepatan() {
        if(kontak0n == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off \n");
        }
    }
    public void printStatus() {
        if(kontak0n == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }

}