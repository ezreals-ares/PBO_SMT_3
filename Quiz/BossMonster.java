package PBO_SMT_3.Quiz;

public class BossMonster extends Monster {

    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower, type);
    }

    @Override 
    public void attack(Character target) {
        int specialDamage = this.getAttackPower() * 2;
        System.out.println(getName() + " Uses Special Attack on " + target.getName() + "!");
        System.out.println("Deals " + specialDamage + " Damage (2x Power)!");
        target.takeDamage(specialDamage);
    }
    
}