package PBO_SMT_3.UTS.game;

public interface StatusEffect {

    void onTurnStart(Character self);
    void onTurnEnd(Character self);
    boolean isExpired();
}

