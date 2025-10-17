package PBO_SMT_3.UTS.game;

public class PiercingStrike implements Skill {
    private final double multiplier;

    public PiercingStrike(double multiplier) { this.multiplier = multiplier; }

    @Override public String name() { return "PiercingStrike(x" + multiplier + ")"; }

    @Override
    public void apply(Character self, Character target) {
    int baseDamage = self.getAttackPower();
        if (self instanceof Player p) {
            baseDamage = p.getStrategy().computeDamage(p, target);
        }

    int dmg = (int) (baseDamage * this.multiplier);
    int oldHp = target.getHealth();

    target.takeDamage(dmg); 
    int actualDamage = oldHp - target.getHealth(); 
    
    System.out.println("[Team A] " + self.getName() + " menggunakan " + name() + " dan memberikan " + actualDamage + " damage!");
    System.out.println("  " + target.getName() + " HP: " + oldHp + " -> " + target.getHealth());
}

    @Override public String toString() { return name(); }
}
