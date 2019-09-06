import java.util.Scanner;

public class Discount{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int ammount;

        System.out.println("Enter the purchase ammount");
        ammount = input.nextInt();

        System.out.println("Discount ammount: " + ammount*0.9);

    }

}