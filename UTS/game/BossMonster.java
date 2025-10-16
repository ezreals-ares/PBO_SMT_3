package PBO_SMT_3.UTS.game;

public class BossMonster extends Enemy {
    private int turnCounter = 0;

    public BossMonster(String name, int hp, int ap, int threat,AttackStrategy strategy ) {
        super(name, hp, ap, threat, strategy);
    }

    @Override
    public void attack(Character target) {
        turnCounter++;
        boolean rage = (getHealt() < getMaxHealth() / 2) || (turnCounter % 3 == 0);
        int base = getAttackPower();
        int dmg = rage ? (int)(base * 2.0) : base;

        int finalDamage = target.onComingDamage(dmg);
        target.takeDamage(finalDamage);

        if (rage)
            System.out.println(getName() + " menggunakan Rage Strike!");
        System.out.println(getName() + " menyerang " + target.getName()
            + " dengan damage " + finalDamage);
    }
}