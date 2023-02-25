import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      String[] name = input.split(" ");
      
      if (name.length == 2) {
         System.out.println(name[1] + ", " + name[0].charAt(0) + ".");
      }
      else if (name.length == 3) {
         System.out.println(name[2] + ", " + name[0].charAt(0) + "." + name[1].charAt(0) + ".");
      }
   }
}