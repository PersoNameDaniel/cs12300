import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    // initializing variables
      int dollar = 100;
      int quarter = 25;
      int dime = 10;
      int nickel = 5;
      int penny = 1;
      int userInput;
      int dollars;
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      int change;

    //getting user input
    userInput = scnr.nextInt();
    change = userInput;

    //if change is 0
    if (change == 0) {
        System.out.println("No change");
        return;
    }

    //computing amount of each
    dollars = change / dollar;
    change %= dollar;

    quarters = change / quarter;
    change %= quarter;

    dimes = change / dime;
    change %= dime;

    nickels = change / nickel;
    change %= nickel;

    pennies = change;

    //printing change
    if (dollars > 0) {
        System.out.println(dollars + (dollars == 1 ? " Dollar" : " Dollars"));
    }

    if (quarters > 0) {
            System.out.println(quarters + (quarters == 1 ? " Quarter" : " Quarters"));
    }

    if (dimes > 0) {
           System.out.println(dimes + (dimes == 1 ? " Dime" : " Dimes"));
    }

    if (nickels > 0) {
        System.out.println(nickels + (nickels == 1 ? " Nickel" : " Nickels"));
    }

    if (pennies > 0) {
        System.out.println(pennies + (pennies == 1 ? " Penny" : " Pennies"));
    }
   }
}
