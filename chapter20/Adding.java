import java.util.Scanner;

public class Adding{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;

        System.out.println("How many numbers will be added?");
        numbers = input.nextInt();

        while(numbers > 0){

            System.out.println("Enter a number: ");
            sum += input.nextInt();

            numbers -= 1;

        }

        System.out.println("Sum: " + sum);

    }

}