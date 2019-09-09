import java.util.Scanner;

public class AgeInSeconds{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int years, months, days, totalDays, totalSeconds;
        double twoBill = 2500000000.0;

        //31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        System.out.println("Enter the number of years: ");
        years = input.nextInt();

        System.out.println("Enter the months: ");
        months = input.nextInt();

        System.out.println("Enter the days: ");
        days = input.nextInt();

        totalDays = days + (years * 365);

        if (months == 1){
            totalDays += 31;
        } 
        else if (months == 2){
            totalDays += (31 + 28);
        }
        else if (months == 3){
            totalDays += (31 + 28 + 31);
        }
        else if (months == 4){
            totalDays += (31 + 28 + 31 + 30);
        }
        else if (months == 5){
            totalDays += (31 + 28 + 31 + 30 + 31);
        }
        else if (months == 6){
            totalDays += (31 + 28 + 31 + 30 + 31 + 30);
        }
        else if (months == 7){
            totalDays += (31 + 28 + 31 + 30 + 31 + 30 + 31);
        }
        else if (months == 8){
            totalDays += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31);
        }
        else if (months == 9){
            totalDays += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30);
        }
        else if (months == 10){
            totalDays += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31);
        }
        else if (months == 11){
            totalDays += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30);
        }
        else if (months == 12){
            totalDays += (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31);
        }
        //would be easier to use loops here^
        System.out.println("Total days alive: " + totalDays);
        totalSeconds = totalDays * 24 * 60 * 60;
        System.out.println("Total seconds alive: " + totalSeconds);
        System.out.println("That is " + (((double)totalSeconds/twoBill) * 100) + " percent of your life!");

    }

}