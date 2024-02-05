package AdeBanky;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Transaction {
    static ArrayList<Customer> customers = new ArrayList<>();

     static Scanner scanner = new Scanner(System.in);

    //Create customer Method
    public static Customer CreateNewCustomer ( ){
        out.print(" customer name : ");
        String name = scanner.nextLine();
        out.print(" customer address : ");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, address);

        customers.add(customer);
        return customer;
    }


    //deposit method
    public static void deposit ( Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }
    //withdraw method
        public static void withdraw ( Account account, double amount) {
        if( account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        }
        else out.println("Balance is insufficient");
        }

        //Check balance method
    public static double checkBalance (Account account){
        return account.getBalance();
    }
}