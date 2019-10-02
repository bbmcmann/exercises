import java.util.*;

public class Walk{

    public static void main(String[] args) {
     
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        double x, y, xDiff, yDiff;
        int steps;
        x = 0;
        y = 0;

        System.out.println("Enter a number");
        steps = input.nextInt();

        for(int i = steps; i > 0; i--){

            xDiff = random.nextDouble()*2 - (double)1;
            yDiff = random.nextDouble()*2 - (double)1;
            System.out.println(xDiff);
            System.out.println(yDiff);

            x += xDiff;
            y += yDiff;

        }

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        
    }


}