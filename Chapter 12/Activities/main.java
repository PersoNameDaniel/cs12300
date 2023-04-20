import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double voltageLevel;

      while (scnr.hasNext()) {
         try {
            voltageLevel = scnr.nextDouble();

            if (voltageLevel >= 4) {
               System.out.println("High");
            }
            else if (voltageLevel >= 0.0 && voltageLevel <= 2.1) {
               System.out.println("Low");
            }
            else {
               System.out.println("xx");
            }
         }
         catch (InputMismatchException excpt) {
            System.out.println("Error getting input");
            scnr.next();
         }
      }
   }
}