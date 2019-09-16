import java.util.Scanner;

public class Dots{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String first, second;
        int dots;

        System.out.println("Give first word: ");
        first = input.nextLine();
        System.out.println("Give second word: ");
        second = input.nextLine();

        dots = 30 - (first.length() + second.length());

        System.out.print(first);

        while(dots > 0){
            System.out.print(".");
            dots -= 1;
        }
        
        System.out.print(second);

    }

}