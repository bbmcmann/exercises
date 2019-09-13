import java.util.Scanner;

public class Steam{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double efficency, airTemp, steamTemp;

        System.out.println("Give the air temperature");
        airTemp = input.nextDouble();
        System.out.println("Give the steam temp");
        steamTemp = input.nextDouble();



        if(steamTemp < 373){
            System.out.println("Aint no steam boi");
            efficency = 0;
        }
        else{
            efficency = 1 - (airTemp/steamTemp);
        }

        System.out.println("Efficency is: " + efficency);
    }

}