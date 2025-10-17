package PBO_SMT_3.UTS.game;

public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) { this.amount = amount; }

    @Override
    public String name() { return "HealSkill(+" + amount + ")"; }

    @Override
    public void apply(Character self, Character target) {
        int before = self.getHealth();
        self.healBy(amount);
        System.out.println(self.getName() + " menggunakan " + name()
            + " memulihkan " + (self.getHealth() - before) + " HP.");
    }

    @Override
    public String toString() { return name(); }
}
