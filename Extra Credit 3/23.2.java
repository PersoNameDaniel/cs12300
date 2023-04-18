import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String shape = scnr.next();
      
      /*
      if (shape.equals("square")) {
         for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
               if (i == 1 || i == 3 || j == 1 || j == 3) {
                  System.out.print("*");
               }
               else {
                  System.out.print(" ");
               }
            }
            System.out.println();
         }
      }
      else if (shape.equals("triangle")) {
         for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
               if (j == 3 || (i == 3 && j % 2 == 1)) {
                  System.out.print("*");
               }
               else {
                  System.out.print(" ");
               }
            }
            System.out.println();
         }
      }
      */

      if (shape.equals("square")) {
         System.out.println("***");
         System.out.println("* *");
         System.out.println("***");
      } 
      else if (shape.equals("triangle")) {
         System.out.println("  *");
         System.out.println(" * *");
         System.out.println("*****");
      }
   }
}
