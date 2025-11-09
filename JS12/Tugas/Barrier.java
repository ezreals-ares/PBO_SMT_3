package PBO_SMT_3.JS12.Tugas;

public class Barrier implements Destroyable {

    private double strength;

    public Barrier(double strength) {
        this.strength = strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {

        this.strength -= 9.0;
    }

    public String getBarrierInfo() {

        return "Barrier Strength = " + (int) strength;
    }
}