import java.util.Scanner;

public class Combos{

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
        int n, r;
        long combos;

    }


}