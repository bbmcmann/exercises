import java.util.Scanner;

public class change{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int changeDue, dollars, quarters, dimes, nickels, pennies;

        System.out.println("Enter the ammount of change: ");
        changeDue = input.nextInt();

        dollars = changeDue/100;
        System.out.println("Dollars: " + dollars);
        changeDue = changeDue - dollars*100;
        System.out.println("Change left: " + changeDue);
        quarters = changeDue/25;
        System.out.println("Quarters: " + quarters);
        changeDue = changeDue - quarters*25;
        System.out.println("Change left: " + changeDue);
        dimes = changeDue/10;
        System.out.println("Dimes:" + dimes);
        changeDue = changeDue - dimes*10;
        System.out.println("Change left: " + changeDue);
        nickels = changeDue/5;
        System.out.println("Nickels: " + nickels);
        changeDue = changeDue - nickels*5;
        System.out.println("Change left: " + changeDue);
        pennies = changeDue;
        System.out.println("Pennies: " + pennies);
        
        System.out.println("Your chnage is: " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickle(s), and " + pennies + " cent(s).");
    }

}