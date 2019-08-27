import java.util.Scanner;

public class BrickDistance{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double g = 32.174;
        double time;
        
        System.out.println("Enter the time: ");
        time = input.nextDouble();

        System.out.println("Distance: " + (0.5 * g * (time*time)));
    }

}