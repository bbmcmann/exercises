public class Account{

    private String accountNumber;
    private String name;
    private int    balance;

    public Account(String accountNumber, String name, int balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String toString(){
        return "Name:\t\t\t" + name + 
            "\nAccount no:\t\t" + accountNumber + 
            "\nCurrent Balance:\t" + balance;
    }

}