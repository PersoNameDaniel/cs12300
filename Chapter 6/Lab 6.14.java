import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];
      int i;
      int values = 0;

      // Read into an array
      for (i = 0; i < 9; i++) {
         int input = scnr.nextInt();
         if (input < 0) {
            break;
         }
         ++values;
         userValues[i] = input;
      }

      // Check for too many numbers
      if ((i == 9 && scnr.hasNextInt())) {
        if (scnr.nextInt() > 0) {
            System.out.println("Too many numbers");
         return;
        }
      }

      // Find middle item
      int middleIndex = values / 2;
      int middleValue = userValues[middleIndex];
      
      // Print output
      System.out.println("Middle item: " + middleValue);
   }
}