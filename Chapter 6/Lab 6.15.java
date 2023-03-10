import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];
      int numValues;
      int threshold;

      numValues = scnr.nextInt();

      for (int i = 0; i < numValues; i++) {
         userValues[i] = scnr.nextInt();
      }
      
      threshold = scnr.nextInt();
      
      for (int i = 0; i < numValues; i++) {
         if (userValues[i] <= threshold) {
            System.out.print(userValues[i] + ",");
         }
      }
      System.out.println();
   }
}