import java.util.*;

public class Guess{

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int guess;
        int x = random.nextInt(10) + 1;
        

        for (int i = 3; i > 0; i -- ){
            System.out.println("Guess between 1 and 10");
            guess = input.nextInt();

            if(guess == x){
                System.out.println("God job!");
                System.exit(0);
            }
        }

        System.out.println("You r trash.");
        System.out.println("Answer was: " + x);

        
    }


}