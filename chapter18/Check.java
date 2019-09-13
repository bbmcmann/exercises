import java.util.Scanner;

public class Check{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double checkBalance, saveBalance;

        System.out.println("What is checking balance?");
        checkBalance = input.nextDouble();
        System.out.println("What is savings balance?");
        saveBalance = input.nextDouble();

        if(saveBalance < 1500.0 || checkBalance < 1000.0){

            System.out.println("Charge is 0.15");

        }
        else{

            System.out.println("no charge");
        }
    }

}