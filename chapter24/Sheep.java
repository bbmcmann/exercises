public class Sheep{

    public static void main(String[] args) {
        
        int n;
        int t;
        double power = 0.83;

        for(t = 0; t < 26; t++){
            
            power = power * 0.83;
            System.out.println(Math.round(220/(1 + 10 * power)));

        }


    }


}