//deposit
//withdraw
//checkBalance

// The problem is that the amount is not getting updated because you are creating a new Bank object in multiple places. 
// Every time you write new Bank(), you create a completely new, separate instance of the Bank class, and each new 
// instance has its own amount variable initialized to 0.

import java.util.Scanner;

public class Bank{
    // 'amount' should be private to protect it from outside changes (encapsulation).
    private int amount = 0;
    // The Scanner can be an instance variable.
    private Scanner input = new Scanner(System.in);

    // This method now correctly modifies the 'amount' of the object it's called on.
    // I also corrected the spelling from "deposite" to "deposit".
    void deposit(){
        System.out.print("Enter the amount that you want to deposit: \t");
        int depositAmount = input.nextInt();
        // It's good practice to check for valid input.
        if (depositAmount > 0) {
            this.amount += depositAmount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        this.checkBalance(); // Show the new balance
    }

    // The withdraw logic is now simplified and works on the correct object's balance.
    void withdraw(){
        System.out.print("Enter the amount that you want to withdraw: \t");
        int withdrawAmount = input.nextInt();
        if (withdrawAmount > this.amount){
            System.out.println("Insufficient funds!");
        } else if (withdrawAmount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            this.amount -= withdrawAmount;
            System.out.println("Withdrawal successful.");
        }
        this.checkBalance(); // Show the new balance
    }

    // Renamed to be more descriptive. It now prints the balance of the current object.
    void checkBalance(){
        System.out.println("Your current balance is: \t"+ this.amount);
    }

    public static void main(String[] args){
        // 1. Create the Bank object *ONCE*, before the loop starts.
        Bank userAccount = new Bank();
        
        while(true){
            System.out.println("\n!! Choose from options !!");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit"); // Added an exit option.
            System.out.print("Enter your choice:\t");
            
            // 2. Use the single 'userAccount' object for all operations.
            int choice = userAccount.input.nextInt();

            if (choice == 1) userAccount.deposit();
            else if (choice == 2) userAccount.withdraw();
            else if (choice == 3) userAccount.checkBalance();
            else if (choice == 4) { System.out.println("Thank you for using our bank. Goodbye!"); break; }
            else System.out.println("Invalid choice. Please try again.");
        }
        // 3. It's good practice to close the scanner to prevent resource leaks.
        userAccount.input.close();
    }
}
