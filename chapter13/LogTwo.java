import java.util.Scanner;

public class LogTwo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double num, baseTwo;

        System.out.println("Enter a double: ");
        num = input.nextDouble();

        baseTwo = (Math.log(num)/(Math.log(2)));

        System.out.println("Base 2 log of the number is: " + baseTwo);

    }

}