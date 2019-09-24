import java.util.Scanner;

public class Divisors{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        n = input.nextInt();

        for(int i = 1; i < n; i++){

            if(n%i == 0){

                sum += i;

            }

        }

        if(sum == n){

            System.out.println(n + " is a perfect number");

        }
        System.out.println(sum);

    }

}