import java.util.Scanner;

public class stringFun{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        String word;
        int beginIndex, endIndex;

        System.out.println("Give me a word: ");
        word = input.nextLine();

        System.out.println("Give me a begining index: ");
        beginIndex = input.nextInt();

        System.out.println("Give me an ending index: ");
        endIndex = input.nextInt();

        System.out.println(word);
        System.out.println(word.substring(beginIndex, endIndex));
    }
}