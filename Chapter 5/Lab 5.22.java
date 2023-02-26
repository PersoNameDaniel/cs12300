import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int numInts = scnr.nextInt();
      
      while (numInts > 0) {
         int sum = 0;
         for (int i = 0; i < numInts; i++) {
            sum += scnr.nextInt();
         }
         System.out.println(sum);
         numInts = scnr.nextInt();
      }
   }
}