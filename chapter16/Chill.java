import java.util.Scanner;
import java.lang.Math;

public class Chill{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double speed, temp, chill;
        System.out.println("Enter wind speedness");
        speed = input.nextInt();
        System.out.println("Enter wind temp");
        temp = input.nextInt();

        if(speed < 3 || temp > 50){

            System.out.println("Windy chillness is: " + temp);

        }
        else{

            chill = (35.74 + 0.6215*temp - 35.75*(Math.pow(speed, 0.16)) + 0.4275*temp*(Math.pow(speed, 0.16)));

            System.out.println("Windy chillness is: " + chill);
        }


    }

}