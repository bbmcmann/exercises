import java.util.Scanner;

public class OrderCheck{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int bolts, nuts, washers;

        System.out.println("Give the bolts.");
        bolts = input.nextInt();
        System.out.println("Give the nuts.");
        nuts = input.nextInt();
        System.out.println("Give the washers.");
        washers = input.nextInt();

        if(bolts > nuts){
            System.out.println("Check order: too few nuts");
        }
        if(washers < bolts*2){
            System.out.println("Check order: too few washers");
        }

        System.out.println("Total cost: " + (bolts*5 + nuts*3 + washers));
    }

}