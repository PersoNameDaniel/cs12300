import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      char ch = scnr.next().charAt(0);
      String str = scnr.nextLine();

      int count = 0;

      for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == ch) {
              count++;
          }
      }

      if (count == 1) {
          System.out.println(count + " " + ch);
      } else {
          System.out.println(count + " " + ch + "'s");
      }
   }
}