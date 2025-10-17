package PBO_SMT_3.UTS.game;

import java.util.Random;

public class Monster extends Enemy {
    private final Random rand = new Random();

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
   public void attack(Character target) {
        int baseDamage = strategy.computeDamage(this, target);
        int variation = (int) (baseDamage * 0.25);
        int randomizedDamage = baseDamage + rand.nextInt(variation * 2 + 1) - variation;

        int finalDamage = target.onComingDamage(Math.max(0, randomizedDamage));
        target.takeDamage(finalDamage);
        System.out.println(getName() + " menyerang " + target.getName() + " dengan damage " + finalDamage);
    }
    
}
