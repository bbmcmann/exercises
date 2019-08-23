import java.util.scanner;

public class change{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        changeDue = input.nextInt();

        dollars = changeDue/100;
        changeDue = changeDue - dollars*100;
        quarters = changeDue/25;
        changeDue = changeDue - quarters*25;
        

    }

}