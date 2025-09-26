package PBO_SMT_3.Quiz;

public class Player extends Character {
    private int level;

    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
    }   

    @Override
    public void attack(Character target) {
        int damage = getAttackPower() + (this.level * 2);
        System.out.println(getName() + " attack with sword! Damage: " + damage);
        target.takeDamage(damage);
    }

    public void heal() {
        int healAmount = this.level * 2;

        if(getHealth() + healAmount > getMaxHealth()) {
            setHealth(getMaxHealth());
        } else {
            setHealth(getHealth() + healAmount);
        }

        System.out.println(getName() + " Use Heal! Restoring " + healAmount + " health");
        System.out.println("Current health " + getHealth());
    }
}
