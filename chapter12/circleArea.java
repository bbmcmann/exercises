import java.util.Scanner;

public class circleArea{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a radius:");
        int data = scan.nextInt();

        System.out.println("Radius: " + data + " Area is: " + (data * data * Math.PI));
    }

}