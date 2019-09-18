import java.util.Scanner;

public class logNatural{


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x, n;
        double sum, currentTerm, previousTerm;

        x = input.nextInt();
        
        sum = 1.0 + (double)x + ((x * x)/2.0);

        n = 3;
        previousTerm = (x*x)/2.0;
        currentTerm = (double)x/n;

        System.out.println(1e-12);
        System.out.println(currentTerm);

        while(currentTerm * previousTerm >= 1e-12){

            System.out.println(n + " time " + currentTerm);
            sum = sum + (previousTerm * currentTerm);
            previousTerm = previousTerm * currentTerm;
            n ++;
            currentTerm = (double) x/n;

        }

        System.out.println(sum);
        System.out.println(Math.exp(x));

    }

}