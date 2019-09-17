import java.util.Scanner;

public class Power{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double x, power;
        int n, nSave;

        System.out.println("Enter X: ");
        x = input.nextDouble();
        System.out.println("Enter N: ");
        n = input.nextInt();

        power = x;
        nSave = n;

        if(n > 0){

            while(n > 1){
                power = power * x;

                n --;

            }
            System.out.print(x + " to the " + nSave + " is " + power);

        }
        else{
            System.out.println("N needs to be positive");
            System.exit(0);
        }


    }

}