import java.util.Scanner;

public class Harmonic{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        int n;

        System.out.println("Enter N");
        n = input.nextInt();

        while(n > 0){

            sum += (1.0/n);

            n-= 1;

        }

        System.out.println("Sum is: " + sum);

    }

}