import java.util.Scanner;


public class Dump{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int trash, charge;

        System.out.println("How much trash?");
        trash = input.nextInt();

        charge = 20;

        for(int i = trash - 200; i >= 100; i -= 100){

            charge += 8;

        }

        System.out.println(charge);

    }

}