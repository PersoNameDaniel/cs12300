import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int validCount = 0;
      int invalidCount = 0;
      int sum = 0;
      int num = 0;
      
      int userInt = scnr.nextInt();
      while (userInt != 0) {
         if (userInt >= 2 && userInt <= 12) {
            validCount++;
            sum += userInt;
            num++;
         } else {
            invalidCount++;
         }
         
         userInt = scnr.nextInt();
      }
      
      if (num > 0) {
        double average = (double) sum / num;
        System.out.println("Average: " + average);
        System.out.println("Valid: " + validCount);
        System.out.println("Invalid: " + invalidCount);
      } else {
         System.out.println("Average: 0.0");
         System.out.println("Valid: 0");
         System.out.println("Invalid: " + invalidCount);
      }
   }
}