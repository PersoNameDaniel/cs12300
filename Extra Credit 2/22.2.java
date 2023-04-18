import java.util.Scanner; 

public class Main {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int x; 
        double y; 
      
        x = scnr.nextInt(); 
      
        y = (((1.0 / 3.0) * x) + ((1.0/4.0) * x) + (2 * x));
      
      System.out.println(y); 
   }
}
