import java.util.Scanner; 

public class LabProgram {
   public static int getAge(int birthMonth, int birthDay, int birthYear, int currMonth, int currDay, int currYear) { 
      
      /* Type your code here. */ 
      
   } 
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int birthMonth, birthDay, birthYear; 
      int currMonth, currDay, currYear; 
      
      birthMonth = scnr.nextInt();
      birthDay = scnr.nextInt();
      birthYear = scnr.nextInt(); 
      
      currMonth = scnr.nextInt();
      currDay = scnr.nextInt();
      currYear = scnr.nextInt(); 
      
      System.out.println(getAge(birthMonth, birthDay, birthYear, currMonth, currDay, currYear)); 
   }
}
