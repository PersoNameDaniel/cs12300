import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userCaption;
      
      userCaption = scnr.nextLine();

      if (userCaption.endsWith(".") || userCaption.endsWith("?") || userCaption.endsWith("!") || userCaption.endsWith("...")) {
         System.out.println(userCaption);
      }
      else {
         userCaption = userCaption.replace(',', '.');
         int len = userCaption.length();
         if (len > 1 && userCaption.charAt(len-1) == '.' && userCaption.charAt(len-2) == '.') {
            System.out.println(userCaption);
         }
         else {
            System.out.println(userCaption + ".");
         }
      }
   }
}
