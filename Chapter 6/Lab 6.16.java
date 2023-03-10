import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int numValues = scnr.nextInt();
      double[] values = new double[numValues];
      double maxValue = 0.0;

      for (int i = 0; i < numValues; ++i) {
         values[i] = scnr.nextDouble();
         if (values[i] > maxValue) {
            maxValue = values[i];
         }
      }

      for (int i = 0; i < numValues; ++i) {
         System.out.printf("%.2f ", values[i] / maxValue);
      }
      System.out.println();
   }
}