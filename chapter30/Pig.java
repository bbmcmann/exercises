import java.util.*;

public class Pig{

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0; 
        int compScore = 0;
        int workSum = 0;
        int playerRoll;
        String roll;

        boolean rolling = true;
        boolean gameOver = false;

        while(!gameOver){

            compScore += compScore + random.nextInt(6)+1 + random.nextInt(6)+1 + random.nextInt(6)+1;
            
            while(rolling){
                System.out.println("Wanna quit? (y/n)");
                roll = input.nextLine();

                playerRoll = random.nextInt(6) + 1;

                if (playerRoll == 1){
                    rolling = false;
                    workSum = 0;
                }
                else{
                    workSum = workSum + playerRoll;
                }

                if(roll.equals("y")){
                    rolling = false;
                }

            }
            playerScore += workSum;


        }

    }


}