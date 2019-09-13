import java.util.Scanner;

public class Game{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int strength, health, luck;

        System.out.println("Write strength:");
        strength = input.nextInt();
        System.out.println("Write health:");
        health = input.nextInt();
        System.out.println("Write luck:");
        luck = input.nextInt();

        if(strength + health + luck > 15){
            System.out.println("Too many points bro. Stop cheating");
            strength = 5;
            health = 5;
            luck = 5;
        }

        System.out.println("Health: " +  health + " Strength: " + strength + " Luck: " + luck);
        
    }

}