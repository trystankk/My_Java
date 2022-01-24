package BankAccount;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {            // main stay in main class
        Scanner input = new Scanner(System.in);         // user input
        System.out.print("Please Enter Account Name : ");
        String UserName = input.nextLine();         // input name
        System.out.print("Please Enter Account Balance : ");
        double UserBalance = input.nextDouble();            //input balance
        while (UserBalance < 0) {   //while loop repeating until correct input
            System.out.print("Please enter a valid account balance : ");
            UserBalance = input.nextDouble();
        }
        AccountSystem PersonalInfo = new AccountSystem();           // PersonalInfo store AccountSystem class
        PersonalInfo.accountObject(UserName, UserBalance);              // to use function from the AccountSystem class
    }
}
