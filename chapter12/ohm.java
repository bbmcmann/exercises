import java.util.Scanner;

public class ohm{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int voltage, resistance;

        System.out.println("Give me your voltage: ");
        voltage = input.nextInt();

        System.out.println("Give me your resistance: ");
        resistance = input.nextInt();

        System.out.println("The current is: " + ((voltage + 0.0) / resistance));
    }
}