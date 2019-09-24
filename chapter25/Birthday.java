import java.util.Scanner;

public class Birthday{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n; 
        double probability;

        n = input.nextInt();
        probability = ((365-1)/(double)365);

        for(int i =2; i <= n; i++ ){

            probability = probability * ((365-i)/(double)365);

        }

        System.out.println(probability);
    }


}