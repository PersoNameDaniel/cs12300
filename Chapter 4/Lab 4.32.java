import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      char[] output = input.toCharArray();
      boolean carry = false;
      
      for (int i = output.length - 1; i >= 0; i--) {
         output[i] = (char) (output[i] + 1);
         
         if (output[i] == ':') {
            output[i] = '0';
            carry = true;
         }
         else if (output[i] == '[') {
            output[i] = 'A';
            carry = true;
         }
         else {
            carry = false;
            break;
         }
      }
      
      String result = new String(output);
      System.out.println(result);
   }
}