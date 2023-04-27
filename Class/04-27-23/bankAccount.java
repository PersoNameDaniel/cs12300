import java.util.Scanner;

public class bankAccount {
    public static void deposit(int amount) {
        int oldBalance;
        oldBalance = balance;
        balance += amount;
        System.out.printf("Current amount: $%d\n", oldBalance);
        System.out.printf("Deposit amount: $%d\n", amount);
        System.out.printf("Amount after deposit: &%d", balance);
    }
    public static void withdraw(int amount) {
        int oldBalance;
        oldBalance = balance;
        balance -= amount;
        System.out.printf("Current amount: $%d\n", oldBalance);
        System.out.printf("Withdraw amount: $%d\n", amount);
        System.out.printf("Amount after withdraw: &%d", balance);
    }
    public static void printBalance() {
        System.out.print(balance);
    }

    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        int balance;
        int amount;
        boolean action; //true means deposit, false means withdraw

        System.out.println("type starting balance.");
        balance = scnr.nextInt();

    }
}
class customer extends bankAccount {
    public static void main (String[] args) {

        int balance;
        boolean action;
        int amount;

        //collecting user input
        System.out.println("type \"true\" to deopsit or \"false\" to withdraw.");
        action = super.scnr.nextBool();
        System.out.println("type amount of money to deposit/withdraw.");
        amount = super.scnr.nextInt();

        //computing
        if (action) {
            super.deposit(amount);
        }
        else {
            super.withdraw(amount);
        }

    }
}