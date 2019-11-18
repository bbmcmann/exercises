import java.util.Scanner;


public class Factorial{

    public static long factorial(int n){
        long total = 1;
        if(n > 20 || n < 0){
            return -1;
        }
        while(n > 0){
            total *= n;
            n--;
        }
        return total;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        long fact;
        System.out.println("Enter a number to be !d");
        n = input.nextInt();
        fact = factorial(n);
        if(fact < 0){
            System.out.println(factorial(n));
            System.out.println("***********************ERROR OUT OF RANGE***********************");
        }
        else{
            System.out.println(factorial(n));
        }

    }

}