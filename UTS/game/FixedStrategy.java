package PBO_SMT_3.UTS.game;

public class FixedStrategy implements AttackStrategy {
    @Override
    public int computeDamage(Character self, Character target) {
        return self.getAttackPower();   
    }

    @Override
    public String toString() {
        return "FixedStrategy";
    }
}