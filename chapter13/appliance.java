import java.util.Scanner;

public class Appliance{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);        
        double cost, hours;

        System.out.println("Enter the cost of kw per hour: ");
        cost = input.nextDouble();

        System.out.println("Enter the kw hours used this year: ");
        hours = input.nextDouble();

        System.out.println("Annual cost: " + (cost*hours)/100);

    } 

}