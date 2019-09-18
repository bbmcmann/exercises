import java.util.Scanner;

public class MPG{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int initMiles, finalMiles, gallons;

        System.out.println("Enter Initial miles");
        initMiles = input.nextInt();
        System.out.println("Enter Final miles");
        finalMiles = input.nextInt();
        System.out.println("Enter gallons");
        gallons = input.nextInt();

        System.out.println("MPG:" + ((double)finalMiles -  initMiles)/(double)gallons);

        while(initMiles >= 0){

            System.out.println("Enter Initial miles");
            initMiles = input.nextInt();
            if(initMiles < 0){
                System.out.println("BYE 1");
                System.exit(0);

            }

            System.out.println("Enter Final miles");
            finalMiles = input.nextInt();
            
            System.out.println("Enter gallons");
            gallons = input.nextInt();

            System.out.println("MPG: " + ((double)finalMiles -  initMiles)/(double)gallons);

        }

        System.out.println("BYE 2");


    }


}