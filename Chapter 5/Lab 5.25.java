import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      if (scnr.hasNextLine()) {
        String input = scnr.nextLine();
      
      int wordCount = 0;
      boolean inWord = false;

      for (int i = 0; i < input.length(); i++) {
         char c = input.charAt(i);

         if (c == ' ' || c == '\t' || c == '\n') {
            inWord = false;
         }
         else if (!inWord) {
            inWord = true;
            wordCount++;
         }
      }

      System.out.println(/*"Number of words: " + */wordCount);
   }
   else {
    System.out.println("0");
   }
}
}