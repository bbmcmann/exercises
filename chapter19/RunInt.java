import java.util.Scanner;
public class RunInt{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int start, ending;

        System.out.println("Enter starting number");
        start = input.nextInt();
        System.out.println("Enter ending number");
        ending = input.nextInt();

        while(start <= ending){

            System.out.println(start);
            start += 1;

        }

    }

}