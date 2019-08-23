public class ex1{
    public static void main(String[] args){
        long hoursWorked = 40;
        double payRate = 10.0, taxRate = 0.10;
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("pay amount: " + (hoursWorked * payRate));
        System.out.println("tax amount: " +(hoursWorked * payRate * taxRate));
    }
}