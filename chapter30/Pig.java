import java.util.*;

public class Pig{

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0; 
        int compScore = 0;
        int workSum = 0;
        int playerRoll, round;
        String roll;

        boolean rolling = true;
        boolean gameOver = false;

        round = 1;
        while(!gameOver){

            System.out.println("**************");
            System.out.println("ROUND: " + round);
            System.out.println("**************");
            compScore += compScore + random.nextInt(6)+1 + random.nextInt(6)+1 + random.nextInt(6)+1;
            System.out.println("Comp current Score: " + compScore);

            if(compScore >= 100){
                rolling = false;
            }
            else{
                rolling = true;
            }
            
            while(rolling){
                
                playerRoll = random.nextInt(6) + 1;
                System.out.println("Player roll: " + playerRoll);

                if (playerRoll == 1){
                    System.out.println("Roled 1, rip");
                    rolling = false;
                    workSum = 0;
                }
                else{
                    workSum = workSum + playerRoll;
                    System.out.println("Didnt roll 1, sum is: " + workSum);
                }

                System.out.println("Wanna quit? (y/n)");
                roll = input.nextLine();

                if(roll.equals("y")){
                    rolling = false;
                }

            }

            playerScore += workSum;
            System.out.println("_________________");
            System.out.println("Player Score: " + playerScore);
            System.out.println("Comp score: " + compScore);

            if(compScore >= 100){
                gameOver = true;
            }
            else if(playerScore >= 100){
                gameOver = true;
            }
            round ++;
        }
        System.out.println("______________________");
        System.out.println("Player Final Score: " + playerScore);
        System.out.println("Comp Final Score: " + compScore);


    }


}