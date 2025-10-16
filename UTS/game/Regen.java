package PBO_SMT_3.UTS.game;

public class Regen implements StatusEffect {
    private final int perTurn;
    private int remaining;

    public Regen(int perTurn, int duration) {
        this.perTurn = perTurn;
        this.remaining = duration;
    }

    @Override public void onTurnStart(Character self) {}

    @Override
    public void onTurnEnd(Character self) {
        int before = self.getHealt();
        self.healBy(perTurn);
        System.out.println("[End Effects] " + self.getName() + " Regen: +" + perTurn + " HP => " + before + " -> " + self.getHealt());
        remaining--;
    }

    @Override public boolean isExpired() { return remaining <= 0; }

    @Override
    public String toString() {
        return "Regen(+" + perTurn + " HP, " + remaining + " turns)";
    }
}
    

