import java.util.Scanner;

public class Odds{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int count = 1; 
        int sum = 0;
        int n;

        n = input.nextInt();

        for( ; count <= n; count +=2){

            sum += count;

        }

        System.out.println(sum);
        System.out.println(n * n);

    }


}