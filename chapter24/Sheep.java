public class Sheep{

    public static void main(String[] args) {
        
        int n;
        int t;
        double power = 0.83;

        System.out.println(20);

        for(t = 1; t < 26; t++){

            
            System.out.println(Math.round(220/(1 + 10 * power)));
            power = power * 0.83;

        }


    }


}