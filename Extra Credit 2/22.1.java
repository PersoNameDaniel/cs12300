import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int userInput = scnr.nextInt();
      int result = userInput * 2;
      System.out.println(result);
   }
}
