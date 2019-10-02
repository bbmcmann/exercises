import java.util.*;

public class SquareRoot{

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        double number, player1Guess, player2Guess;
        int rounds, p1Score, p2Score;
        String player1, player2;
        boolean player1Turn = true;

        p1Score = 0;
        p2Score = 0;

        System.out.println("Enter p1 name:");
        player1 = input.nextLine();
        System.out.println("Enter p1 name:");
        player2 = input.nextLine();

        System.out.println("How many rounds?");
        rounds = input.nextInt();

        for(int i = rounds; i > 0; i--){

            number = random.nextDouble() * 100;
            System.out.println(number);
            
            if(player1Turn){
                System.out.println("Guess, " + player1);
                player1Guess = input.nextDouble();
                System.out.println("Guess, " + player2);
                player2Guess = input.nextDouble();
                player1Turn = false;
            }
            else{
                System.out.println("Guess, " + player2);
                player2Guess = input.nextDouble();
                System.out.println("Guess, " + player1);
                player1Guess = input.nextDouble();
                player1Turn = true;
            }

            if(Math.abs(number - player1Guess) > Math.abs(number-player2Guess)){
                System.out.println(player2 + " wins.");
                p2Score ++;
            }
            else{
                System.out.println(player1 + " wins.");
                p1Score ++;
            }

        }

        if(p1Score > p2Score){
            System.out.println(player1 + " wins with a score of: " + p1Score);
            System.out.println(player2 + " loses with a score of: " + p2Score);
        }
        else{
            System.out.println(player2 + " wins with a score of: " + p2Score);
            System.out.println(player1 + " loses with a score of: " + p1Score);
        }

    }


}