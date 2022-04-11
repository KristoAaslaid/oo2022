package tund08kodutoo;

import java.util.Scanner;
import java.util.Random;

class global{
    static String[] enemies = {"Skeleton", "Snail"};
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

class player extends global{
    int health = 100;
    int high_attack = getRandomNumber(15, 30);
    int low_attack = getRandomNumber(5, 15);
}

class skeleton extends global{
     int enemyhealth = getRandomNumber(60, 100);
     int enemydamage = getRandomNumber(15, 25);
}

class snail extends global{
    int enemyhealth = getRandomNumber(10, 50);
    int enemydamage = getRandomNumber(5, 10);
}

public class adventuregame {
    public static void main(String[] args) {
        player Conan = new player();
        System.out.println("You are Conan, you are entering a dungeon!");
        // randomly generated enemy ahead
        Random r = new Random();
        String random_enemy = global.enemies[r.nextInt(global.enemies.length)];
        System.out.println("You are facing a mighty " + random_enemy + "!");
        if(random_enemy.equals("Skeleton")) {
            skeleton skelly = new skeleton();
            System.out.println("Skeleton HP is " + skelly.enemyhealth);
            while (skelly.enemyhealth > 0 & Conan.health > 0){
                System.out.println("1. High attack (low chance)");
                System.out.println("2. Low attack (high chance)");
                skeleton skellydamage = new skeleton();
                global g = new global();
                player p = new player();
                int percentage = g.getRandomNumber(0, 100);
                Scanner input = new Scanner(System.in);
                String read = input.nextLine();
                if(read.equals("1")){
                    if(percentage < 40){
                        skelly.enemyhealth = skelly.enemyhealth - p.high_attack;
                        if(skelly.enemyhealth <= 0) {
                            System.out.println("You beat the skeleton!");
                            break;
                        }
                        Conan.health = Conan.health - skellydamage.enemydamage;
                        System.out.println("You did " + p.high_attack + " damage; Skeleton HP " + skelly.enemyhealth );
                        System.out.println("Skeleton did " + skellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                    else{
                        System.out.println("Missed!");
                        Conan.health = Conan.health - skellydamage.enemydamage;
                        System.out.println("Skeleton did " + skellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                }
                if(read.equals("2")){
                    if(percentage < 75){
                        skelly.enemyhealth = skelly.enemyhealth - p.low_attack;
                        if(skelly.enemyhealth <= 0) {
                            System.out.println("You beat the skeleton!");
                            break;
                        }
                        Conan.health = Conan.health - skellydamage.enemydamage;
                        System.out.println("You did " + p.low_attack + " damage; Skeleton HP " + skelly.enemyhealth );
                        System.out.println("Skeleton did " + skellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                    else{
                        System.out.println("Missed!");
                        Conan.health = Conan.health - skellydamage.enemydamage;
                        System.out.println("Skeleton did " + skellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                }
            }
        }
        if(random_enemy.equals("Snail")){
            snail snelly = new snail();
            System.out.println("Snail HP is " + snelly.enemyhealth);
            while (snelly.enemyhealth > 0 & Conan.health > 0){
                System.out.println("1. High attack (low chance)");
                System.out.println("2. Low attack (high chance)");
                snail snellydamage = new snail();
                global g = new global();
                player p = new player();
                int percentage = g.getRandomNumber(0, 100);
                Scanner input = new Scanner(System.in);
                String read = input.nextLine();
                if(read.equals("1")){
                    if(percentage < 40){
                        snelly.enemyhealth = snelly.enemyhealth - p.high_attack;
                        if(snelly.enemyhealth <= 0) {
                            System.out.println("You beat the snail!");
                            break;
                        }
                        Conan.health = Conan.health - snellydamage.enemydamage;
                        System.out.println("You did " + p.high_attack + " damage; Snail HP " + snelly.enemyhealth );
                        System.out.println("Snail did " + snellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                    else{
                        System.out.println("Missed!");
                        Conan.health = Conan.health - snellydamage.enemydamage;
                        System.out.println("Snail did " + snellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                }
                if(read.equals("2")){
                    if(percentage < 75){
                        snelly.enemyhealth = snelly.enemyhealth - p.low_attack;
                        if(snelly.enemyhealth <= 0) {
                            System.out.println("You beat the snail!");
                            break;
                        }
                        Conan.health = Conan.health - snellydamage.enemydamage;
                        System.out.println("You did " + p.low_attack + " damage; Snail HP " + snelly.enemyhealth );
                        System.out.println("Snail did " + snellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                    else{
                        System.out.println("Missed!");
                        Conan.health = Conan.health - snellydamage.enemydamage;
                        System.out.println("Snail did " + snellydamage.enemydamage + " damage; Conan HP " + Conan.health);
                    }
                }
            }
        }
    }
}