package PBO_SMT_3.UTS.game;

import java.util.*;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void run() {
           System.out.println("=== SETUP ===");
        System.out.println("Team A:");
        for (Character c : teamA) {
            if (c instanceof Player p) {
                System.out.println("  - Player(name=" + p.getName() + ", HP=" + p.getHealt() + "/" + p.maxHealth +
                    ", AP=" + p.getAttackPower() + ", Lv=" + p.getLevel() + ", Strategy=" + p.getStrategy() + ")");
                System.out.print("    Skills: ");
                if (p.getSkills().isEmpty()) System.out.println("None");
                else System.out.println(p.getSkills());
                System.out.print("    Effects: ");
                if (p.getEffect().isEmpty()) System.out.println("None");
                else System.out.println(p.getEffect());
            } else {
                System.out.println("  - " + c.getClass().getSimpleName() + "(name=" + c.getName() + ", HP=" + c.getHealt() +
                    "/" + c.maxHealth + ", AP=" + c.getAttackPower() + ")");
            }
        }

        System.out.println("Team B:");
        for (Character c : teamB) {
            if (c instanceof Enemy e) {
                System.out.println("  - " + c.getClass().getSimpleName() +
                    "(name=" + e.getName() + ", HP=" + e.getHealt() + "/" + e.maxHealth +
                    ", AP=" + e.getAttackPower() + ", Threat=" + e.getThreatLevel() + ")");
            }
        }

        System.out.println("\n=== BATTLE START ===");
        int turn = 1;

        while (alive(teamA) && alive(teamB)) {
            System.out.println("\n=== TURN " + turn + "===");

            for(Character c : teamA) {
                if(c.isAlive()) {
                    Character target = pickTarget(teamB);
                    if(target != null) c.performTurn(target);
                }
            }

             for(Character c : teamB) {
                if(c.isAlive()) {
                    Character target = pickTarget(teamA);
                    if(target != null) c.performTurn(target);
                }
            }

            turn++;
            
        }

        System.out.println("\n=== RESULT ===");
        if(alive(teamA)) {
            System.out.println("Team A menang");
        } else {
            System.out.println("Team B Menang");
        }

           System.out.println("\nSisa HP:");
        for (Character c : teamA) {
            System.out.println("  - " + c.getClass().getSimpleName() + "(" + c.getName() + "): " + c.getHealt() + "/" + c.maxHealth);
        }
        for (Character c : teamB) {
            System.out.println("  - " + c.getClass().getSimpleName() + "(" + c.getName() + "): " + c.getHealt() + "/" + c.maxHealth);
        }
    }
    

    private boolean alive (List<Character> team) {
        return team.stream().anyMatch(Character::isAlive);
    }

    private Character pickTarget(List<Character> team) {
        return team.stream().filter(Character::isAlive).findFirst().orElse(null);
    }
}
