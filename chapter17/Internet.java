import java.util.Scanner;

public class Internet{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String order;
        double price;
        int delivery;
        double deliverPrice = 0;

        System.out.println("Enter item");
        order = input.nextLine();
        System.out.println("Enter price");
        price = input.nextDouble();
        System.out.println("Overnoght delivery = 1, no overnight = 0");
        delivery = input.nextInt();
        
        if(price < 10){
            deliverPrice += 2.00;
        }
        if(delivery == 1){
            deliverPrice += 3.00;
        }

        System.out.println(order + " " + price);
        System.out.println("Delivery: " + deliverPrice);
        System.out.println("Total: " + (deliverPrice+price));
    }

}