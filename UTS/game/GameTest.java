package PBO_SMT_3.UTS.game;

import java.util.*;

public class GameTest {
    public static void main(String[] args) {
        Player hero = new Player("HeroVipkas", 120, 25, 5, new LevelScaledStrategy(2));
        hero.addSkill(new HealSkill(15));
        hero.addSkill(new PiercingStrike(1.2));
        hero.addEffect(new Shield(10, 3));
        hero.addEffect(new Regen(8, 4));

        Enemy boss = new BossMonster("Drake", 150, 28, 5, new FixedStrategy());
        Enemy goblin = new Monster("Goblin", 80, 12, 2, new FixedStrategy());

        List<Character> teamA = List.of(hero);
        List<Character> teamB = List.of(boss, goblin);

        Battle battle = new Battle(teamA, teamB);
        battle.run();
    }
}
