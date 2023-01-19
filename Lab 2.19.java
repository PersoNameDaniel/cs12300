import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int baseChar; 
      int headChar; 
      String whiteSpace = "     ";
      
      baseChar = scnr.nextInt();
      headChar = scnr.nextInt();
      baseChar = 0;
      
      System.out.println(whiteSpace + headChar);
      System.out.println(whiteSpace + headChar + headChar);
      System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar);
      System.out.println("" +baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar + headChar);
      System.out.println("" +baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar);
      System.out.println(whiteSpace + headChar + headChar);
      System.out.println(whiteSpace + headChar);
   }
}
