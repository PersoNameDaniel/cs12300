import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String line;

      do {
         line = scnr.nextLine();
         if (!line.equalsIgnoreCase("done") && !line.equalsIgnoreCase("d")) {
            String reversedLine = reverse(line);
            System.out.println(reversedLine);
         }
      } while (!line.equalsIgnoreCase("done") && !line.equalsIgnoreCase("d"));
   }

   public static String reverse(String s) {
      String reversed = "";
      for (int i = s.length() - 1; i >= 0; i--) {
         reversed += s.charAt(i);
      }
      return reversed;
   }
}