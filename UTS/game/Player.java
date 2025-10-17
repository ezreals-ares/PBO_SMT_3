package PBO_SMT_3.UTS.game;
import java.util.*;

public class Player extends Character {
    private final int level;
    private final List<Skill> skills = new ArrayList<>();
    private AttackStrategy strategy;
    private final Random rand = new Random();

    public Player(String name, int hp, int ap, int level, AttackStrategy strat) {
        super(name, hp, ap);
        this.level = level;
        this.strategy = strat;
    }

    public void addSkill(Skill s) { if (s != null) skills.add(s); }
    public List<Skill> getSkills() { return skills; }
    public int getLevel() { return level; }
    public AttackStrategy getStrategy() {
        return strategy;
    }

    @Override
    public void attack(Character target) {
        if (!skills.isEmpty() && rand.nextBoolean()) {
            Skill chosen = skills.get(rand.nextInt(skills.size()));
            chosen.apply(this, target);
        } else {
            int dmg = strategy.computeDamage(this, target);
            int finalDamage = target.onComingDamage(dmg);
            target.takeDamage(finalDamage);
            System.out.println(getName() + " menyerang " + target.getName()
                + " dengan damage " + finalDamage);
        }
    }
}

