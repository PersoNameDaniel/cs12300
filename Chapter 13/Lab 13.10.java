import java.util.Scanner;
import java.util.NoSuchElementException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val1;
      int val2;
      int val3;
      int max = Integer.MIN_VALUE;
      int count = 0;
      
      try {
         val1 = scnr.nextInt();
         count++;
         if (val1 > max) {
            max = val1;
         }
         
         val2 = scnr.nextInt();
         count++;
         if (val2 > max) {
            max = val2;
         }
         
         val3 = scnr.nextInt();
         count++;
         if (val3 > max) {
            max = val3;
         }
         
         //System.out.println(count + " input(s) read:");
         System.out.println(max);
      }
      catch (NoSuchElementException e) {
         if (count == 0) {
            System.out.println("0 input(s) read:");
            System.out.println("No max");
         }
         else {
            System.out.println(count + " input(s) read:");
            System.out.println("Max is " + max);
         }
      }
   }
}
