package PBO_SMT_3.UTS.game;

import java.util.Random;

public class Monster extends Enemy {
    private final Random rand = new Random();

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        int damage = strategy.computeDamage(this, target);
        damage += rand.nextInt(6) - 3;
        int finalDamage = target.onComingDamage(Math.max(0, damage));
        target.takeDamage(finalDamage);
        System.out.println(getName() + " menyerang " + target.getName() +  " dengan damage " + finalDamage);
    }
    
}
