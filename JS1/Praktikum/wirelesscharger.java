package PBO_SMT_3.JS1.Praktikum;

public class wirelesscharger extends charger {

    private double jarakMaks;
    private double suhuMax;


    public double getJarakMaks() {
        return jarakMaks;
    }

    public double getSuhu() {
        return suhuMax;
    }

    public void setSuhuMax(double suhuMax) {
        this.suhuMax = suhuMax;
    }

    public void setJarakMaks(double jarakMaks) {
        this.jarakMaks = jarakMaks;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jarak Maksimal: " + jarakMaks + " cm");
        System.out.println("Suhu Maksimal: " + suhuMax + "Celcius");
    }
}
