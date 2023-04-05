import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   
   public static String coinFlip(Random rand) {
      int flip = rand.nextInt(2);
      if (flip == 1) {
         return "Heads";
      } else {
         return "Tails";
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      int numFlips;

      //getting user input
      numFlips = scnr.nextInt();

      //calling coin flip method
      for (int i=0; i<numFlips; i++) {
         System.out.println(coinFlip(rand));
      }
   }
}
