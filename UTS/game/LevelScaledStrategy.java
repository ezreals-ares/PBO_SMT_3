package PBO_SMT_3.UTS.game;

public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        if (self instanceof Player) {
            Player p = (Player) self;
            return p.getAttackPower() + p.getLevel() * bonusPerLevel;
        }
        return self.getAttackPower();   
    }

    @Override
    public String toString() {
        return "LevelScaled(+ " + bonusPerLevel + "/level)";
    }
}