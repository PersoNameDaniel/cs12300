import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText; 
      String cleanedText = ""; 
      
      // Read the user's input
      if (scnr.hasNextLine()) {
         userText = scnr.nextLine();
      } else {
         return;
      }
      
      // Find the index of the first non-space character
      int firstNonSpace = 0;
      while (firstNonSpace < userText.length() && userText.charAt(firstNonSpace) == ' ') {
         firstNonSpace++;
      }
      
      // Find the index of the last non-space character
      int lastNonSpace = userText.length() - 1;
      while (lastNonSpace >= 0 && userText.charAt(lastNonSpace) == ' ') {
         lastNonSpace--;
      }
      
      // Check if any non-space character was found
      if (firstNonSpace > lastNonSpace) {
         return;
      }
      
      // Copy the range of correct characters to the new string
      cleanedText = userText.substring(firstNonSpace, lastNonSpace + 1);
      
      // Output the cleaned string
      System.out.println(cleanedText);
   }
}