package PBO_SMT_3.UTS.game;

public class PiercingStrike implements Skill {
    private final double multiplier;

    public PiercingStrike(double multiplier) { this.multiplier = multiplier; }

    @Override public String name() { return "PiercingStrike(x" + multiplier + ")"; }

    @Override
    public void apply(Character self, Character target) {
        int dmg = (int) (self.getAttackPower() * multiplier);
        int oldHp = target.getHealt();
        int finalDamage = target.onComingDamage(dmg); 
        target.takeDamage(finalDamage);
        System.out.println("[Team A] " + self.getName() + " uses " + name() + ": " + finalDamage + " dmg");
        System.out.println("  " + target.getName() + " HP: " + oldHp + " -> " + target.getHealt());
    }

    @Override public String toString() { return name(); }
}
