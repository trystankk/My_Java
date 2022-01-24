package BankAccount;

import java.util.Scanner;

public class AccountSystem {
    public void accountObject(String UserName, Double UserBalance) {
        Scanner input = new Scanner(System.in);
        double Withdrawal, Deposit;     // digits with decimal
        int mainMenu;           // only digits for menu
        do {            // to keep menu repeating
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Account Status");
            System.out.println("2. Withdrawal");
            System.out.println("3. Deposit");
            System.out.println("99. Exit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" ");
            System.out.print("Please Select Above Option: ");
            mainMenu = input.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (mainMenu) {         // Selection from menu
                case 1: {
                    System.out.println("Dear " + UserName + ",");
                    System.out.println("****************************************");
                    System.out.print("Current Balance : " + UserBalance);
                    break;
                }
                case 2: {
                    System.out.print("Please enter amount you wish to withdraw : ");
                    Withdrawal = input.nextDouble();
                    System.out.println("****************************************");
                    if (Withdrawal <= 0) {          // if input less than 0
                        System.out.println("Invalid amount entered");
                    } else {
                        UserBalance = UserBalance - Withdrawal;
                        System.out.print("your current bank balance is : " + UserBalance);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Please enter amount you wish to deposit : ");
                    Deposit = input.nextDouble();
                    System.out.println("****************************************");
                    if (Deposit <= 0) {         // if input less than 0
                        System.out.println("Invalid amount entered");           // if less than 0 input
                    } else {
                        UserBalance = UserBalance + Deposit;
                        System.out.print("your new balance is : " + UserBalance);
                    }
                    break;
                }
                case 99: {
                    System.out.println("Thank you for banking with us");
                    break;
                }
            }
        }
        while (mainMenu != 99);         // quit
    }
}
