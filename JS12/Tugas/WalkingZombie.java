package PBO_SMT_3.JS12.Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(double health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {

        switch (level) {
            case 1:
                this.health += (this.health * 0.10);
                break;
            case 2:
                this.health += (this.health * 0.30);
                break;
            case 3:
                this.health += (this.health * 0.40);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= 14.5;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}