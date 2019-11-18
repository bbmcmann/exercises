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

    public static long combinations(int n, int r){
        if(n == r){
            return 1;
        }
        long factN = factorial(n);
        long factR = factorial(r);
        if(factN < 0 || factR < 0){
            return -1;
        }
        return factN/(factR * factorial(n-r));
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, r;
        long combos;

        System.out.println("Enter N");
        n = input.nextInt();

        System.out.println("Enter R");
        r = input.nextInt();

        combos = combinations(n, r);

        if(combos < 0){
            System.out.println("ERROR. OUT OF BOUNDS");
        }
        else{
            System.out.println("Total Combos: " + combos);
        }

    }

}