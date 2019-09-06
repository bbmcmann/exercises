import java.util.Scanner;

public class Gas{
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int capacity, gauge, mpg;

        System.out.println("Whats the tank capacity?");
        capacity = input.nextInt();
        System.out.println("How full is it?");
        gauge = input.nextInt();
        System.out.println("Que es MPG?");
        mpg = input.nextInt();

        if(200 > (capacity*(gauge/100)*mpg)){
            System.out.println("Tu nescisitas gas!");
        }
        else{
            System.out.println("your all good!");
        }

    }

}