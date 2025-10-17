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
                System.out.println("  - Player(name=" + p.getName() + ", HP=" + p.getHealth() + "/" + p.maxHealth +
                    ", AP=" + p.getAttackPower() + ", Lv=" + p.getLevel() + ", Strategy=" + p.getStrategy() + ")");
                System.out.print("    Skills: ");
                if (p.getSkills().isEmpty()) System.out.println("None");
                else System.out.println(p.getSkills());
                System.out.print("    Effects: ");
                if (p.getEffect().isEmpty()) System.out.println("None");
                else System.out.println(p.getEffect());
            } else {
                System.out.println("  - " + c.getClass().getSimpleName() + "(name=" + c.getName() + ", HP=" + c.getHealth() +
                    "/" + c.maxHealth + ", AP=" + c.getAttackPower() + ")");
            }
        }

        System.out.println("Team B:");
        for (Character c : teamB) {
            if (c instanceof Enemy e) {
                System.out.println("  - " + c.getClass().getSimpleName() +
                    "(name=" + e.getName() + ", HP=" + e.getHealth() + "/" + e.maxHealth +
                    ", AP=" + e.getAttackPower() + ", Threat=" + e.getThreatLevel() + ")");
            }
        }

       System.out.println("\n=== BATTLE START ===");
        int turn = 1;

       
        List<Character> teamA_alive = new ArrayList<>(teamA);
        List<Character> teamB_alive = new ArrayList<>(teamB);

        while (isTeamAlive(teamA_alive) && isTeamAlive(teamB_alive)) {
            System.out.println("\n=== TURN " + turn++ + " ===");

            for (Character attacker : new ArrayList<>(teamA_alive)) {
                if (attacker.isAlive()) {
                    Character target = pickPlayerTarget(teamB_alive);
                    if (target != null) {
                        attacker.performTurn(target);
                        if (!target.isAlive()) {
                           System.out.println(">> " + target.getName() + " telah dikalahkan! <<");
                        }
                    }
                }
            }
            teamB_alive.removeIf(c -> !c.isAlive()); 

          
            for (Character attacker : new ArrayList<>(teamB_alive)) {
                if (attacker.isAlive()) {
                    Character target = pickEnemyTarget(teamA_alive);
                    if (target != null) {
                        attacker.performTurn(target);
                         if (!target.isAlive()) {
                           System.out.println(">> " + target.getName() + " telah dikalahkan! <<");
                        }
                    }
                }
            }
            teamA_alive.removeIf(c -> !c.isAlive()); 
        }
        System.out.println("\n=== RESULT ===");
        if(isTeamAlive(teamA)) {
            System.out.println("Team A menang");
        } else {
            System.out.println("Team B Menang");
        }

           System.out.println("\nSisa HP:");
        for (Character c : teamA) {
            System.out.println("  - " + c.getClass().getSimpleName() + "(" + c.getName() + "): " + c.getHealth() + "/" + c.maxHealth);
        }
        for (Character c : teamB) {
            System.out.println("  - " + c.getClass().getSimpleName() + "(" + c.getName() + "): " + c.getHealth() + "/" + c.maxHealth);
        }
    }
    
    private boolean isTeamAlive(List<Character> team) {
        return team.stream().anyMatch(Character::isAlive);
    }

    private Character pickPlayerTarget(List<Character> enemies) {
        return enemies.stream()
                .filter(Character::isAlive)
                .map(c -> (Enemy) c) 
                .min(Comparator.comparing(Enemy::getThreatLevel).reversed() 
                             .thenComparing(Character::getHealth)) 
                .orElse(null);
    }

    private Character pickEnemyTarget(List<Character> players) {
        return players.stream()
                .filter(Character::isAlive)
                .max(Comparator.comparing(Character::getHealth)) 
                .orElse(null);
    }
}
