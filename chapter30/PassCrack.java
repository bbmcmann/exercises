import java.util.*;

public class PassCrack{

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String password, passGuess = "";
        char char1, char2, char3, char4, char5;
        int tries = 0;

        String choices = "qwertyuiopasdfghjklzxcvbnm";
        //choices = choices + choices.toUpperCase();
        //choices = choices + "1234567890";

        System.out.println("Enter a password. ");
        password = input.nextLine();


        while(!password.equals(passGuess)){
            passGuess = "";
            tries ++;
            System.out.println(tries);
            for(int i = password.length(); i > 0; i--){
                passGuess = passGuess + choices.charAt(random.nextInt(choices.length()));
            }

        }
        System.out.println("Your password was: " + password + " I guessed: " + passGuess);
        System.out.println("I guessed in " + tries + " tries.");

        
    }


}