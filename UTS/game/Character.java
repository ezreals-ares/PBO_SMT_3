package PBO_SMT_3.UTS.game;
import java.util.*;
public abstract class Character {
    private final String name;
    protected final int maxHealth;
    private int healt;
    private final int attackPower;

    private final List<StatusEffect> effect = new ArrayList<>();

    protected Character(String name, int health, int attackPower) {
        if(health < 0 || attackPower < 0) {
            throw new IllegalArgumentException("Health dan attack power harus >= 0");
        }

        this.name = name;
        this.maxHealth = health;
        this.healt = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHealt() {
        return healt;
    }

    public List<StatusEffect> getEffect() {
        return effect;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public final void healBy(int amount) {
    
         setHealth(getHealt() + amount);
    }

    protected final void setHealth(int value) {
        if(value < 0) value = 0;
        if(value > maxHealth) value = maxHealth;
        this.healt = value;
    }

    public final boolean isAlive() {return healt > 0;}

    protected int onComingDamage(int base) {
        int finalDamage = base;
        for(StatusEffect e : effect) {
            if(e instanceof Shield shield) {
                finalDamage -= shield.getFlatReduce();
            }
        }
        return Math.max(0, finalDamage);
    }

    public final void takeDamage(int damage) {
        setHealth(getHealt() - Math.max(0, damage));
    }

    public final void addEffect(StatusEffect e) {
        if(e != null) effect.add(e);
    }

    public final void performTurn(Character target) {
        for (StatusEffect e : effect) e.onTurnStart(this);
        if (isAlive()) attack(target);
        for (StatusEffect e : effect) e.onTurnEnd(this);
        effect.removeIf(StatusEffect::isExpired);
    }

    public abstract void attack(Character target);




}
