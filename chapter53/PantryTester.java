import java.util.Scanner;

public class PantryTester{
  public static void main (String[] args){
    Jam goose = new Jam("Gooseberry", "7/4/86", 12);
    Jam apple = new Jam("Crab Apple", "9/30/99", 8);
    Jam rhub  = new Jam("Rhubarb", "10/31/99", 3);

    Scanner input = new Scanner(System.in);
    Pantry hubbard = new Pantry(goose, apple, rhub);

    int jamNumber;

    System.out.println(hubbard);

    System.out.println("Enter Your selection (1,2,3)");
    jamNumber = input.nextInt();
    hubbard.select(jamNumber);
    
    while(jamNumber != -1){
        System.out.println("Enter ammount to spread");
        hubbard.spread(input.nextInt());

        System.out.println("Enter Your selection (1,2,3)");
        jamNumber = input.nextInt();
        hubbard.select(jamNumber);
    }    
  }
}