/* Account class is the main class, AccountSystem is sub-class which store the menu list and functions. 
   Import scanner as we need user to input. Public static void main at the main class. For the main class 
   will prompt for user’s name and account balance. Double for UserBalance because it has decimal point. 
   Then, ‘while’ loop will keep looping if user input negative amount, until user input the correct amount. 
   To bring both classes link together, PersonalInfo as an object to store AccountSystem class. AccountSystem 
   class is not a main. The  menu list using ‘switch’ in ‘do’ loop to keep repeating the menu until user 
   input ‘99’ to stop the program.*/

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
