import java.util.Scanner;

import com.sun.glass.ui.SystemClipboard;

public class Pie{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int weight;
        System.out.println("Enter your weight");
        weight = input.nextInt();
        if(weight >= 220 && weight <= 280 ){
            System.out.println("You are the proper weight.");

        }
        else{
            System.out.println("You cant enter bro");
        }

    }

}