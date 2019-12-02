import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Panagram{

    public static void main(String[] args) {

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        boolean allLetters = true;
        Scanner input = new Scanner(System.in);
        String tester = input.nextLine();
        for(int i = 24; i >=0; i--){
            if(tester.indexOf(alphabet[i]) < 0){
                allLetters = false;
            }
        }
        if(allLetters){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not panagram");
        }

    }



}
