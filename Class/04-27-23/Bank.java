import java.util.Scanner;

 class BankAccount {
    private int balance;

    public void deposit(int amount) {
        int oldBalance = balance;
        balance += amount;
        System.out.printf("Current amount: $%d\n", oldBalance);
        System.out.printf("Deposit amount: $%d\n", amount);
        System.out.printf("Amount after deposit: $%d\n", balance);
    }

    public void withdraw(int amount) {
        int oldBalance = balance;
        balance -= amount;
        System.out.printf("Current amount: $%d\n", oldBalance);
        System.out.printf("Withdraw amount: $%d\n", amount);
        System.out.printf("Amount after withdraw: $%d\n", balance);
    }

    public void printBalance() {
        System.out.printf("Balance: $%d\n", balance);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int setBalance) {
        balance = setBalance;
    }
}

class Customer extends BankAccount {
    public void performTransaction(boolean deposit, int amount) {
        if (deposit) {
            super.deposit(amount);
        } else {
            super.withdraw(amount);
        }
        super.printBalance();
    }

    public void setBalance(int userBalance) {
        super.setBalance(userBalance);
    }
}

public class Bank {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    Customer customer = new Customer();

    System.out.println("Type starting balance:");
    int balance = scnr.nextInt();
    customer.setBalance(balance);

    System.out.println("Type \"true\" to deposit or \"false\" to withdraw:");
    boolean action = scnr.nextBoolean();
    System.out.println("Type amount of money to deposit/withdraw:");
    int amount = scnr.nextInt();

    customer.performTransaction(action, amount);
}
}
