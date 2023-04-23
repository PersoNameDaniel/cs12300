import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      if (n < 0) { // If n is negative
         return -1;
      } else if (n == 0) { // Base case 1: n is 0
         return 0;
      } else if (n == 1) { // Base case 2: n is 1
         return 1;
      } else { // Recursive case
         return fibonacci(n - 1) + fibonacci(n - 2);
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}