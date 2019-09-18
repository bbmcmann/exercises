import java.util.Scanner;
import java.util.Random;

public class Multiply{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        int numOne, numTwo;

        for(int i = 10; i >0; i--){
            numOne = rand.nextInt(9);
            numTwo = rand.nextInt(9);
            System.out.println("What is " + numOne + " * " + numTwo);

            if(input.nextInt() == numOne * numTwo ){
                System.out.println("Correct!");
                score ++;
            }
            else{
                System.out.println("You are trash");
            }

        }

        System.out.println(score);

    }

}