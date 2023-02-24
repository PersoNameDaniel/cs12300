import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      //declare variables
      int firstNum;
      int secondNum;
      int thirdNum;
      
      //assign variables
      firstNum = scnr.nextInt();
      secondNum = scnr.nextInt();
      thirdNum = scnr.nextInt();

      //finding and printing smallest number
      if ((firstNum <= secondNum) && (firstNum <= thirdNum)) {
         System.out.println(firstNum);
      }

      else if ((secondNum <= firstNum) && (secondNum <= thirdNum)) {
         System.out.println(secondNum);
      }

      else {
         System.out.println(thirdNum);
      }

   }
}