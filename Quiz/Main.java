package PBO_SMT_3.Quiz;

public class Main {
    public static void main(String[] args) {
       Player p1 = new Player("Yuusha Nawaf", 250, 45, 15);
       Character[] monsterTeam = new Character[3];
       monsterTeam[0] = new Monster("Goblin Scout", 80, 15, "Goblin");
       monsterTeam[1] = new Monster("Ogre", 150, 25, "Ogre");
       monsterTeam[2] = new BossMonster("Hydra", 300, 35, "Mythical Beast");

       System.out.println("==========================================");
       System.out.println("Duel Until First Defeat");
       System.out.println(p1.getName() + " (HP: " + p1.getHealth() + ")");
       System.out.println("VERSUS");
       for(Character monster : monsterTeam) {
            System.out.println("- " + monster.getName() + " (HP: " + monster.getHealth() + ")");
       }
       System.out.println("==========================================");

       int turn = 1;
       boolean isBattleOver = false;
       boolean monsterDefeat = false;
       boolean playerDefeat = false;

       while (!isBattleOver) {
            System.out.println("--- TURN " + turn + " ---");
            Character target = null;
            for(Character monster : monsterTeam) {
                if(monster.getHealth() > 0) {
                    target = monster;
                    break;
                }
            }

            if(target != null) {
                System.out.println(">> " + p1.getName() + " attacks " + target.getName() + "!");
                p1.attack(target);

                if(target.getHealth() <= 0) {
                    System.out.println(target.getName() + " has been defeated!");
                    isBattleOver = true;
                    monsterDefeat = true;
                }
            }

            if(!isBattleOver) {
                System.out.println(">> The monster retaliate");
                for(Character monster : monsterTeam) {
                    if(monster.getHealth() > 0) {
                        monster.attack(p1);
                
                        if(p1.getHealth() <= 0) {
                            System.out.println(p1.getName() + " has been defeated!");
                            isBattleOver = true;
                            playerDefeat = true;
                            break;
                        }
                    }
                }

                if(!isBattleOver && p1.getHealth() < p1.getMaxHealth() * 0.3) {
                    System.out.println();
                    p1.heal();
                }

                System.out.println("\n--- End of Turn " + turn + " ---");
                System.out.println(p1.getName() + " HP: " + p1.getHealth());
                System.out.println("--------------------------------\n");
                turn++;
            }
 
            System.out.println("\n========================================");
            System.out.println("The Battle Is Over");
            System.out.println("\n========================================");
            if(monsterDefeat) {
                System.out.println(p1.getName() + " Wins The Duel ");
            } else if(playerDefeat) {
                System.out.println(p1.getName() + " Lose The Duel");
            } else {
                System.out.println("\n======================================");
            }

       }
    }
}
