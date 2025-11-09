package PBO_SMT_3.JS12.Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(double health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {

        switch (level) {
            case 1:
                this.health += (this.health * 0.30);
                break;
            case 2:
                this.health += (this.health * 0.40);
                break;
            case 3:
                this.health += (this.health * 0.50);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= 8.5;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}
