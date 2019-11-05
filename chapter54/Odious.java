import java.util.Scanner;
public class Odious{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter a number bro.");
        number = input.nextInt();

        while(number > 0){
            if(findBinaryOnes(number) % 2 == 1){
                System.out.println("Its ODIOUS");
            }
            else{
                System.out.println("Its evil.");
            }
            System.out.println("Enter a number bro.");
            number = input.nextInt();
        }

    }

    public static int findBinaryOnes(int number){
        int numOfOnes = 0;

        while(number != 0){
            number = number % 2;
            if(number == 1){
                numOfOnes ++;
            }
            number = number/2;
        }

        return numOfOnes;
    }

}