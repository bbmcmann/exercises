import java.util.Scanner;

public class Harmonic{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double numOne, numTwo;

        System.out.println("X:");
        numOne = input.nextDouble();
        System.out.println("Y:");
        numTwo = input.nextDouble();
        System.out.println("Average:");
        System.out.println((numOne + numTwo)/2);
        System.out.println("harmonic Avg:");
        System.out.println(2/((1/numOne) + (1/numTwo)));

    }

}