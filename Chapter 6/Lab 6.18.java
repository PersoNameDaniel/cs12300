import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Read beginning integer
      int numWords = scnr.nextInt();
      
      // Create array to store words
      String[] words = new String[numWords];
      
      // Read words
      for (int i = 0; i < numWords; i++) {
         words[i] = scnr.next();
      }
      
      // Read end character
      char ch = scnr.next().charAt(0);
      
      // Output words that contain the character
      for (int i = 0; i < numWords; i++) {
         if (words[i].indexOf(ch) != -1) {
            System.out.print(words[i] + ",");
         }
      }
      
      System.out.println();
   }
}