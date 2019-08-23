public class ex2{
    public static void main(String[] args){

        double x = 4.0;
        double y = (3*(x*x)) - (8*x) + 4;
        System.out.println("Answer at x = : " + x + " is: " + y);

        x = 0.0;
        y = (3*(x*x)) - (8*x) + 4;
        System.out.println("Answer at x = : " + x + " is: " + y);

        x = 2.0;
        y = (3*(x*x)) - (8*x) + 4;
        System.out.println("Answer at x = : " + x + " is: " + y);

        x = 2.0;
        y = quadratic(x);
        System.out.println("Answer at x = : " + x + " is: " + y);
    }

    public static double quadratic(double x){
        return (3*(x*x)) - (8*x) + 4;
    }
}