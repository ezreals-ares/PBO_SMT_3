package PBO_SMT_3.UTS.game;

public class Shield implements StatusEffect {
    private final int flatReduce;
    private int remaining;

    public Shield(int flatReduce, int duration) {
        this.flatReduce = flatReduce;
        this.remaining = duration;
    }

    public int getFlatReduce() { return flatReduce; }

    @Override public void onTurnStart(Character self) {}
    @Override public void onTurnEnd(Character self) { remaining--; }
    @Override public boolean isExpired() { return remaining <= 0; }

    @Override public String toString() {
        return "Shield(-" + flatReduce + " dmg, " + remaining + " turns)";
    }
}



