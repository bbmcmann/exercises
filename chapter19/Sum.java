import java.util.Scanner;

public class Sum{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, count, sum;

        System.out.println("Give Me N");
        n = input.nextInt();
        count = 1;
        sum = 0;

        while(count <= n){
            sum += count;
            count += 1;
        }

        System.out.println(sum);
        System.out.println((n*(n+1))/2);
    }

}