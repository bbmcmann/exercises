import java.util.scanner;

public class Factorial{

    public static long factorial(int n){
        long total = 0;
        while(n > 1){
            total += n * n-1;
        }
        return total;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


    }

}