package PBO_SMT_3.JS12.Tugas;

public abstract class Zombie implements Destroyable {

    protected double health;
    protected int level;

    public Zombie(double health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    @Override
    public abstract void destroyed();

    public String getZombieInfo() {

        return "Health = " + (int) health + "\nLevel = " + level;
    }
}